package com.example.mars.controller;


import com.example.mars.model.Photo;
import com.example.mars.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "pag/")
public class PagingController {

    @Autowired
    PhotoRepository photoRepository;

    @GetMapping("page4")
    public ResponseEntity<List<Photo>> getPageOfPhotos4() {
        int page = 4;
        int size = 5;
        PageRequest pageRequest = PageRequest.of(page, size);

        Page<Photo> pagePhoto = photoRepository.findAll(pageRequest);
        List<Photo> lstCounties = pagePhoto.getContent();
        if (lstCounties.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(lstCounties, HttpStatus.OK);
    }

    @GetMapping("page")
    public ResponseEntity<List<Photo>> getPageOfPhotos(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);

        Page<Photo> pagePhoto = photoRepository.findAll(pageRequest);
        List<Photo> lstPhotos = pagePhoto.getContent();
        if (lstPhotos.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(lstPhotos, HttpStatus.OK);

    }

    @GetMapping("pageinfo")
    public ResponseEntity<Map<String, Object>> getPageOfPhotosInfo(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);

        Page<Photo> pagePhoto = photoRepository.findAll(pageRequest);
        List<Photo> lstPhotos = pagePhoto.getContent();
        if (lstPhotos.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);


        Map<String, Object> response = new HashMap<>();
        response.put("photos", lstPhotos);
        response.put("currentPage", pagePhoto.getNumber());
        response.put("totalitems", pagePhoto.getTotalElements());
        response.put("totalPages", pagePhoto.getTotalPages());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}

