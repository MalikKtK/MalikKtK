package com.example.mars03.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import javax.annotation.processing.Generated;

@Entity
public class Photo {

    @Id
    private Integer id;
    @JsonProperty("sol")
    private Integer sol;

    @ManyToOne
    @JsonProperty("camera")
    @JoinColumn(name = "cameraid", referencedColumnName = "cameraId")
    private Camera camera;

    @JsonProperty("img_src")
    private String imgSrc;
    @JsonProperty("earth_date")
    private String earthDate;

    @ManyToOne
    @JoinColumn(name = "roverid", referencedColumnName = "roverId")
    @JsonProperty("rover")
    private Rover rover;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("sol")
    public Integer getSol() {
        return sol;
    }

    @JsonProperty("sol")
    public void setSol(Integer sol) {
        this.sol = sol;
    }

    @JsonProperty("camera")
    public Camera getCamera() {
        return camera;
    }

    @JsonProperty("camera")
    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @JsonProperty("img_src")
    public String getImgSrc() {
        return imgSrc;
    }

    @JsonProperty("img_src")
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @JsonProperty("earth_date")
    public String getEarthDate() {
        return earthDate;
    }

    @JsonProperty("earth_date")
    public void setEarthDate(String earthDate) {
        this.earthDate = earthDate;
    }

    @JsonProperty("rover")
    public Rover getRover() {
        return rover;
    }

    @JsonProperty("rover")
    public void setRover(Rover rover) {
        this.rover = rover;
    }

}
