package com.movieworkshop.controller;

import com.movieworkshop.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    private MovieService service = new MovieService();

    @GetMapping("/create")
    public String index() {
        return "index";
    }

    @PostMapping("/create")
    public String create(WebRequest req) {

        service.create(req);

        return "redirect:/getallmovies";
    }
}
