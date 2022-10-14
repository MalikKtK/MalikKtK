package com.example.cookieshop.controllers;

import com.example.cookieshop.models.Cookie;
import com.example.cookieshop.repositories.CookieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class CookieController {
    CookieRepository repo = new CookieRepository();

    @GetMapping("/")
    public String index(HttpSession session){
        return "index";
    }

    @GetMapping("/basket")
    public String basket(HttpSession session){
        return "basket";
    }

    @GetMapping("/shop")
    public String basket(HttpSession session, Model cookieModel){
        cookieModel.addAttribute("cookies",repo.getAllCookies());
        return "shop";
    }

    @GetMapping("/addToBasket")
    public String add(@RequestParam String id){
        return "";
    }
}
