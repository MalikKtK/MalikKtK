package com.example.mars.controller;

import com.example.mars.model.Camera;
import com.example.mars.model.Photo;
import com.example.mars.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JPQLRESTController {

    @Autowired
    PhotoRepository photoRepository;

    @GetMapping("/photodesc/{descr}")
    List<Photo> getPhotosDescription(@PathVariable String descr) {
        return photoRepository.findPhotoByDescriptionIsLike("%" + descr + "%");
    }

    @GetMapping("photosmany")
    List<Photo> getPhotosMany(@RequestParam Map<String, String> requestParams) {
        String desc = requestParams.get("desc");
        String imgsrc = requestParams.get("imgsrc");
        return photoRepository.findPhotoByDescriptionIsLikeOrImgSrcLike("%"+desc+"%", "%"+imgsrc+"%");
    }

    @GetMapping("photocount")
    Long countPhotos() {
        return photoRepository.count();
    }

    @GetMapping("/photocountdesc/{descr}")
    Long getPhotosCountDescription(@PathVariable String descr) {
       return photoRepository.countPhotoByDescriptionxx("%"+descr+"%");
    }

    @GetMapping("/sortby")
    List<Photo> sortPhotos(@RequestParam Map<String, String> requestParams) {
        String col1 = requestParams.get("col1");
        String col2 = requestParams.get("col2");
        return photoRepository.findAll(Sort.by(col1).descending().and(Sort.by(col2)));
    }

    @GetMapping("/photobycamera/{cameraid}")
    List<Photo> getPhotosCountDescription(@PathVariable Integer cameraid) {
        return photoRepository.findPhotoByCameraCameraId(cameraid);
    }

    @GetMapping("/photosids/{id1}/{id2}")
    List<Photo> getPhotosBetweenId(@PathVariable Integer id1, @PathVariable Integer id2) {
        Photo photo = new Photo();
        photo.setId(id1);
        Camera camera = new Camera();
        camera.setCameraId(id2);
        photo.setCamera(camera);

        //Photo photo2 = new Photo();
        //photo2.setDescription("%nice%");
        return photoRepository.findAll(Example.of(photo));
    }


}
