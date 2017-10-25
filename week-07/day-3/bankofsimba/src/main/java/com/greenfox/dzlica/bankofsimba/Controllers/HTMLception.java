package com.greenfox.dzlica.bankofsimba.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLception {

    @RequestMapping(value="htmltext")
    public String htmltext(Model model) {
        model.addAttribute("mytext", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmltext";
    }
}
