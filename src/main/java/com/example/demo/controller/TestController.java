package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class TestController {

    @RequestMapping("")
    public String home(){
        return "home";
    }

    @RequestMapping("/next")
    public String next(String name,String[] food,String gender,Model model){
        model.addAttribute("name", name);
        model.addAttribute("food", food);
        model.addAttribute("gender", gender);
        return "next";
    }


}
