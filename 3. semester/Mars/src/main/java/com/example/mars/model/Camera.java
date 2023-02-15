package com.example.mars.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "rover_id",
    "full_name"
})

@Entity
@Generated("jsonschema2pojo")
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

    @JsonProperty("id")
    public Integer getCameraId() {
        return cameraId;
    }

    @JsonProperty("id")
    public void setCameraId(Integer id) {
        this.cameraId = id;
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
