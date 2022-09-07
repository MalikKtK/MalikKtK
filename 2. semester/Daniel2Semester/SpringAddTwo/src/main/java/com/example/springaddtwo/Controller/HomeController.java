package com.example.springaddtwo.Controller;

import com.example.springaddtwo.Model.DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
  
  @GetMapping("/")
  public  String home() {
    return "Home/index";
  }
  
  @PostMapping("/calculate")
  public String calculate(@ModelAttribute DTO data, Model model) {
    String value_1 = data.getValue_1();
    String value_2 = data.getValue_2();
    double result = Double.parseDouble(value_1) + Double.parseDouble(value_2);
    
    model.addAttribute("result", result);
    return "Home/calculate";
  }
  
  
}