package com.example.dzlica.foxclub.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String infopage(Model model) {
        model.addAttribute("name", "Mr. Fox");
        return "index";
    }

}
