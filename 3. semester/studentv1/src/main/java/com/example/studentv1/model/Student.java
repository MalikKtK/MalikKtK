package com.example.studentv1.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private LocalDate bornDate;
    private LocalTime bornTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBornDate() {
        return bornDate;
    }
    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
    public LocalTime getBornTime() {
        return bornTime;
    }
    public void setBornTime(LocalTime bornTime) {
        this.bornTime = bornTime;
    }
    
}
