package com.example.mars.controller;

import com.example.mars.model.Photo;
import com.example.mars.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "sort/")
public class SortPagingController {

    @Autowired
    PhotoRepository photoRepository;

    private Sort.Direction getSortDirection(String direction) {
        if (direction.equals("desc")) {
            return Sort.Direction.DESC;
        }
        return Sort.Direction.ASC;
    }

    @GetMapping("justsort")
    public String justSort(@RequestParam(defaultValue = "cameraid, asc") String[] sort) {
        for (String s : sort) {
            System.out.println(s);
        }
        List<Sort.Order> orders = new ArrayList<>();
        if (sort[0].contains(",")) {
            for (String sortOrder : sort) {
                String[] _sort = sortOrder.split(",");
                orders.add(new Sort.Order(getSortDirection(_sort[1]), _sort[0]));
            }
        } else {
            orders.add(new Sort.Order(getSortDirection(sort[1]), sort[0]));
        }

        return orders.toString();
    }

    @GetMapping("/sortphoto")
    public ResponseEntity<List<Photo>> sortPhoto(@RequestParam(defaultValue = "id,desc") String[] sort) {
        for (String s: sort) {
            System.out.println(s);
        }

        List<Sort.Order> orders = new ArrayList<>();
        if (sort[0].contains(",")) {
            for (String sortOrder: sort) {
                String[] _sort = sortOrder.split(",");
                orders.add(new Sort.Order(getSortDirection(_sort[1]), _sort[0]));
            }
        } else {
            orders.add(new Sort.Order(getSortDirection(sort[1]), sort[0]));
        }

        List photos = photoRepository.findAll(Sort.by(orders));
        if (photos.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(photos, HttpStatus.OK);
    }

    @GetMapping("/sortphotopage")
    public ResponseEntity<Map<String, Object>>  sortPhotoPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "id,desc") String[] sort
    ) {
        List<Sort.Order> orders = new ArrayList<>();
        if (sort[0].contains(",")) {
            for (String sortOrder: sort) {
                String[] _sort = sortOrder.split(",");
                orders.add(new Sort.Order(getSortDirection(_sort[1]), _sort[0]));
            }
        } else {
            orders.add(new Sort.Order(getSortDirection(sort[1]), sort[0]));
        }

        Pageable pagingSort = PageRequest.of(page, size, Sort.by(orders));
        Page<Photo> pagePhoto = photoRepository.findAll(pagingSort);
        List<Photo> photos = pagePhoto.getContent();

        if (photos.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        Map<String, Object> response = new HashMap<>();
        response.put("photos", photos);
        response.put("currentPage", pagePhoto.getNumber());
        response.put("totalItems", pagePhoto.getTotalElements());
        response.put("totalPages", pagePhoto.getTotalPages());

        return new ResponseEntity<>(response, HttpStatus.OK);

    }




}
