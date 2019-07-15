package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    // get information from songform.html
    @GetMapping ("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());   // var song has empty Song class
        return "songform";   // goto songform.html where user will fill the song variable
    }


    // post information from songform.html
    /*
     * post information from songform.html
     * Song object was passed to confirmsong.html as a variable song
     */
    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);  //pass the song variable
        return "confirmsong";  // goto confirmsong.html
    }

}
