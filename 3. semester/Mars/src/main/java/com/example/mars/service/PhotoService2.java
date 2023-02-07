package com.example.mars.service;

import com.example.mars.model.Photo;

import java.util.List;

public interface PhotoService2 {

    List<Photo> findAllLastDigit(Integer digit);

    List<Photo> findAllFirstDigit(Integer digit);
}
