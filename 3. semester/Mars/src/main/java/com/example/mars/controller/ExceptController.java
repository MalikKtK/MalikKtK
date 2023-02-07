package com.example.mars.controller;

import com.example.mars.exception.ResourceNotFoundException;
import com.example.mars.model.Photo;
import com.example.mars.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping(path = "exp/")
public class ExceptController {

    @Autowired
    PhotoRepository photoRepository;

    @GetMapping("/")
    public String hello() {
        return "hej xxx";
    }

    @GetMapping("/file/{filename}")
    public String getFilename(@PathVariable String filename) {
        return filename;
    }

    @GetMapping("/file/{filetext}")
    public String getFile(@PathVariable String filename) {
        String fileContent = "x";
        try {
            FileInputStream fs = new FileInputStream("c:/AFile/" + filename);
            try {
                byte[] bytes = fs.readAllBytes();
                fileContent = new String(bytes);
                System.out.println(fileContent);
            } catch (IOException ioerr) {
                System.out.println("IOExp ioerr=" + ioerr);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT Found e=" + e.getMessage());
        }
        return fileContent;
    }

    @GetMapping("/divx/{divnum}")
    public int getdivnumx(@PathVariable int divnum) {
        int i1 = 100;
        int i2 = i1/divnum;
        return i2;
    }

    @GetMapping("/div/{divnum}")
    public int getdivnum(@PathVariable int divnum) {
        int i1 = 100;
        try {
            int i2 = i1/divnum;
            i1 = i2;
        } catch (ArithmeticException ae) {
            System.out.println("ae=" + ae);
        }

        return i1;
    }

    @GetMapping("/loop/{loopnum}")
    public int getloop(@PathVariable int loopnum) {
        int x = 0;
        for (int i=0; i<loopnum; i++) {
            x++;
        }
        return x;
    }

    @GetMapping("/photox/{id}")
    public ResponseEntity<Photo> findPhotoByIdx(@PathVariable int id) {
        Optional<Photo> obj = photoRepository.findById(id);
        if (obj.isPresent()) {
            return new ResponseEntity<>(obj.get(), HttpStatus.OK);
        } else {
            Photo ph = new Photo();
            ph.setDescription("Not Found");
            return new ResponseEntity<>(ph, HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/photo/{id}")
    public ResponseEntity<Photo> findPhotoById(@PathVariable int id) {
        Photo ph = photoRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("We couldnt find photo with id = " + id)
        );
        return new ResponseEntity<>(ph, HttpStatus.OK);
    }



}


