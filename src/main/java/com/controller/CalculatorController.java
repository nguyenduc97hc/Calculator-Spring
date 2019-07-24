package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller

public class CalculatorController{
    @GetMapping ("/")
    String getIndex(){
        return "index";
    }
   @RequestMapping("/calculator")
    public String calculator(@RequestParam(name = "firstNum",required = false) double firstNum, @RequestParam (name = "operator",required = false) String operator, @RequestParam(name = "secondNum",required = false) double secondNum, Model model){
       double result = 0;
       switch (operator){
           case "+":
               result = firstNum +secondNum;
               break;
           case "-":
               result  = firstNum - secondNum;
               break;
           case "*":
               result = firstNum * secondNum;
               break;
           case "/":
               result = firstNum/secondNum;
               break;

       }
       model.addAttribute("firstNum",firstNum);
       model.addAttribute("operator",operator);
       model.addAttribute("secondNum",secondNum);
       model.addAttribute("result",result);
       return "index";
   }
}
