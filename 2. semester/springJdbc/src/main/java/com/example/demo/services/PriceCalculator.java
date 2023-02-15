package com.example.demo.services;

public class PriceCalculator {
    public int getPriceFromAge(int age){
        if(age < 0){
            return -1;
        }
        if(age > 64){
            return 10;
        }
        return 20;
    }
}
