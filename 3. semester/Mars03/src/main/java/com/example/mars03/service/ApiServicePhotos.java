package com.example.mars03.service;

import com.example.mars03.model.Photo;

import java.util.List;

public interface ApiServicePhotos {
    List<Photo> getPhotos();
    List<Photo> getPhotos(int sol);
}
