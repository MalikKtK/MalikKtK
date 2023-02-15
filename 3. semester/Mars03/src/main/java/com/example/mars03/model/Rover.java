package com.example.mars03.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Rover {


    @JsonProperty("id")
    @Id
    private Integer roverId;

    @JsonProperty("name")
    private String name;
    @JsonProperty("landing_date")
    private String landingDate;
    @JsonProperty("launch_date")
    private String launchDate;
    @JsonProperty("status")
    private String status;

    public Integer getRoverId() {
        return roverId;
    }

    public void setRoverId(Integer roverId) {
        this.roverId = roverId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("landing_date")
    public String getLandingDate() {
        return landingDate;
    }

    @JsonProperty("landing_date")
    public void setLandingDate(String landingDate) {
        this.landingDate = landingDate;
    }

    @JsonProperty("launch_date")
    public String getLaunchDate() {
        return launchDate;
    }

    @JsonProperty("launch_date")
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }


}
