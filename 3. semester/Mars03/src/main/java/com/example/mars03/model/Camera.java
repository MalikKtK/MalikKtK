package com.example.mars03.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Camera {

    @Id
    @JsonProperty("id")
    private Integer cameraId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rover_id")
    private Integer roverId;

    @JsonProperty("full_name")
    private String fullName;

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("rover_id")
    public Integer getRoverId() {
        return roverId;
    }

    @JsonProperty("rover_id")
    public void setRoverId(Integer roverId) {
        this.roverId = roverId;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
