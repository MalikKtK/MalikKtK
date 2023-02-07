package com.example.mars.repository;

import com.example.mars.model.Photo;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {

    List<Photo> findPhotoByDescriptionIsLike(String description);

    List<Photo> findPhotoByDescriptionIsLikeOrImgSrcLike(String description, String imgSrc);

    Integer countAllById(Integer id);

    @Query("select count(p) from Photo p where p.description like ?1")
    Long countPhotoByDescriptionxx(String desc);

    List<Photo> findAll(Sort sort);

    List<Photo> findPhotoByCameraCameraId(Integer id);

    List<Photo> findPhotoByIdBetween(Integer id1, Integer id2);


}

