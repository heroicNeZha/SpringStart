package edu.ustc.SpringStart.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ForeController {
    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }

}
