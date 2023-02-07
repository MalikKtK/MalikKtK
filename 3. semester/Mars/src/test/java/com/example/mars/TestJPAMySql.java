package com.example.mars;

import com.example.mars.model.Camera;
import com.example.mars.repository.CameraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestJPAMySql {

    @Autowired
    CameraRepository cameraRepository;


    @Test
    void testSomeCameras() {
        List<Camera> cameras = cameraRepository.findAll();
        assertEquals(true, cameras.size()>0);
    }

    @Test
    void testCameraId() {
        Optional<Camera> opt = cameraRepository.findById(20);
        assertEquals(true, opt.isPresent());
    }


}
