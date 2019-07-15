package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    @GetMapping ("/songform")    // get information from songform.html
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());   // var song has empty Song class
        return "songform";   // goto songform.html
    }

    @PostMapping("/songform")    // post information from songform.html
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);
        return "confirmsong";
    }

}
