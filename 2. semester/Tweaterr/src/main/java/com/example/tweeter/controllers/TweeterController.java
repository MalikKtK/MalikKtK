package com.example.tweeter.controllers;

import com.example.tweeter.models.Tweat;
import com.example.tweeter.repositores.TestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TweeterController {
    private final TestRepository testRepo = new TestRepository();

    @GetMapping("/")
    public String index(Model m, HttpSession session){
        if((boolean)session.getAttribute("isUserLoggedIn")){
            m.addAttribute("userEmail",(String) session.getAttribute("email"));
        }

        List<Tweat> listOfAllTweats = testRepo.getAllTweats();
        m.addAttribute("allTweats",listOfAllTweats);
        return "index";
    }

    @GetMapping("/test")
    public String test(Model m){
        m.addAttribute("tweat", new Tweat("Hey allesammen"));
        return "test";
    }

    @PostMapping("/login")
    public String login(WebRequest form, HttpSession session){
        String email = form.getParameter("email");
        String password = form.getParameter("password");
        //Kode der går ned i databasen og tjekker om det er korrekt email og password
        session.setAttribute("loggedinEmail", email);
        session.setAttribute("isUserLoggedin", true);

        return "redirect:/";
    }
}
