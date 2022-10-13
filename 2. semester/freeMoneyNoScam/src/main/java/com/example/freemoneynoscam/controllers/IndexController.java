package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    private ValidateEmailService validateEmailService = new ValidateEmailService();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm) {

        boolean isValid = validateEmailService.isEmailValid(dataFromForm.getParameter("email"));
        System.out.println(isValid);
        return "redirect:/";
    }
}
