package com.example.CONROLLERS;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MANAGer {

    @GetMapping("/manager")
    public String main(Model model) {
        return "manager";
    }
}
