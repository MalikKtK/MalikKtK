package com.example.mars03.controller;

import com.example.mars03.model.Photo;
import com.example.mars03.service.ApiServicePhotos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotoRESTController {

    @Autowired
    ApiServicePhotos apiServicePhotos;

    @GetMapping("/photos")
    public List<Photo> getPhotos() {
        List<Photo> lstPhotos = apiServicePhotos.getPhotos();
        return lstPhotos;
    }

    @GetMapping("/photosol/{sol}")
    public List<Photo> getPhotos(@PathVariable int sol) {
        List<Photo> lstPhotos = apiServicePhotos.getPhotos(sol);
        return lstPhotos;
    }

}
