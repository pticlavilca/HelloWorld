package com.jpaul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main")
@RestController
public class MainController {
    @GetMapping("/api")
    public String getMessage(){
        return "Hello World";
    }

    @GetMapping("/plus")
    public int plus(){
        return 1 + 1;
    }
    @GetMapping("/minus")
    public int minus(){
        return 5 - 6;
    }
    @GetMapping("/times")
    public int times(){
        return 2 * 6;
    }
    @GetMapping("/compare")
    public int compare(){
        int number1 = 45;
        int number2 = 35;
        if(number1 > number2){
            return number1;
        }
        else{
            return number2;
        }
    }

}
