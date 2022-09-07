package com.example.my_first_website_new.controller;

import com.example.my_first_website_new.service.CurrentDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HomeController {
CurrentDay currentDay = new CurrentDay();

    @GetMapping("/")
    public String index() {

        return "Hello Dat22v1";
    }

    @GetMapping("/message")
    public String message() {
        return "Hello Claus";
    }

    @GetMapping("/message2")
    public String message2() {
        return "Hello Tove";
    }

    @GetMapping("/message3")
    public String message3(@RequestParam String name) {
        return "Hello " + name;    //http://localhost:2635/message3?name=Malik
    }

    @GetMapping("/watch")
    public String video(@RequestParam String v) {
        return "Now I am showing video with id: " + v;       //http://localhost:2635/watch?v=6O-tyaizHGI
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return input;
    }

    @GetMapping("/erdetfredag")
    public String ErDetFredag() {
       return currentDay.isFriday();
    }


    // Constructor

    // Getter and Setter


}
