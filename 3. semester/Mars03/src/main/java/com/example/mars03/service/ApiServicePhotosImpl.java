package com.example.mars03.service;

import com.example.mars03.model.Foto;
import com.example.mars03.model.Photo;
import com.example.mars03.model.Rover;
import com.example.mars03.model.Camera;
import com.example.mars03.repository.CameraRepository;
import com.example.mars03.repository.PhotoRepository;
import com.example.mars03.repository.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServicePhotosImpl implements ApiServicePhotos{

    String photoUrlSol10 = "https://api.nasa.gov/mars-photos/api/v1/rovers/perseverance/photos?sol=10&api_key=DEMO_KEY";
    //api_key=cXrM4POFLGgBFlOOAbiEk3K0q2NfzynY0Ckydqap


    @Autowired
    RoverRepository roverRepository;

    @Autowired
    CameraRepository cameraRepository;

    @Autowired
    PhotoRepository photoRepository;


    private RestTemplate restTemplate;
    public ApiServicePhotosImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Photo> getPhotos() {
        System.out.printf("GetPhotos from Nasa");
        ResponseEntity<Foto> photoResponse =
                restTemplate.exchange(photoUrlSol10,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Foto>() {
                        });
        Foto foto = photoResponse.getBody();
        List<Photo> photos =  foto.getPhotos();
        return photos;
    }

    String getUrlFromSol(int sol) {
        String url1 = "https://api.nasa.gov/mars-photos/api/v1/rovers/perseverance/photos?sol=";
        String url2 = url1 + sol + "&api_key=cXrM4POFLGgBFlOOAbiEk3K0q2NfzynY0Ckydqap";
        return url2;
    }

    public void savePhotos(List<Photo> lstPhoto) {
        for (Photo photo: lstPhoto) {
            Rover rover = photo.getRover();
            roverRepository.save(rover);
            Camera camera = photo.getCamera();
            cameraRepository.save(camera);
            photoRepository.save(photo);
        }
    }

    @Override
    public List<Photo> getPhotos(int sol) {
        System.out.printf("GetPhotos from Nasa");
        String urlsol = getUrlFromSol(sol);
        ResponseEntity<Foto> photoResponse =
                restTemplate.exchange(urlsol,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Foto>() {
                        });
        Foto foto = photoResponse.getBody();
        List<Photo> photos =  foto.getPhotos();
        System.out.println("Antal photos med sol="+sol+" er:" + photos.size());
        savePhotos(photos);
        return photos;
    }

}
