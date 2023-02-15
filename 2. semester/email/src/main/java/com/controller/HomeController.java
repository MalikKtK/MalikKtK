package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/user")
    public String user(Model model) {
        String username = "Nicklas";
        model.addAttribute("name", username); //Adding data to the view
        return "user-information"; // Returning name of view
    }
}