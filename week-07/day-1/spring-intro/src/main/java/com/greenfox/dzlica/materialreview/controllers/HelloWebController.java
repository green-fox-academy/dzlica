package com.greenfox.dzlica.materialreview.controllers;

import com.greenfox.dzlica.materialreview.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    public AtomicLong loadCounter = new AtomicLong(1);
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"blue", "yellow", "red", "black", "pink", "green"};
    String[] fontSize = {"14", "17", "20", "24"};

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("counter", loadCounter.getAndIncrement());
        int hellosNum = new Random().nextInt(hellos.length);
        model.addAttribute("hello", hellos[hellosNum]);
        int colorNum = new Random().nextInt(colors.length);
        model.addAttribute("szin", colors[colorNum]);

        int fontNum = new Random().nextInt(fontSize.length);
        model.addAttribute("fonts", fontSize[fontNum]);
        return "greeting";
    }


}
