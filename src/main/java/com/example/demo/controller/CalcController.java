package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calc")
public class CalcController {
    
    @RequestMapping("")
    public String index(){
        return "calc";
    }

    @RequestMapping("calc-result")
    public String a (String num1,String num2,Model model){
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int ans = number1 + number2;
        String answer = Integer.toString(ans);
        model.addAttribute("answer", answer);
        return "ans";
    }

}
