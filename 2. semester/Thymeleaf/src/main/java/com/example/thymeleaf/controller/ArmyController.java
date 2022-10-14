package com.example.thymeleaf.controller;

import com.example.thymeleaf.repository.ArmyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArmyController {

    ArmyRepository repo = new ArmyRepository();

    @GetMapping("/")
    public String getSoldier(Model model) {

        // Arraylist der kommer fra db -> repository -> servicelog -> controller
        model.addAttribute("soldierlist", repo.getAll());

        // Model = Mælkekarton

        return "soldier";
    }
}
