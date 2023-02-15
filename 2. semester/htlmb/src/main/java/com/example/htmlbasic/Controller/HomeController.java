package com.example.htmlbasic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/exercise")
    public String exercise() {
        return "exercise";
    }

    @GetMapping("/boxes")
    public String boxes () {
        return "boxes";
    }

    @GetMapping("/hit")
    public String hit() {
        return "hit";
    }

    @GetMapping("/hit2")
    public String hit2() {
        return "hit2";
    }
}
