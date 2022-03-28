package com.example.CONROLLERS;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondDirector {

    @GetMapping("/SecondDirector")
    public String main(Model model) {
        return "SecondDirector";
    }
}
