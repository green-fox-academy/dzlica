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

    //int idx = new Random().nextInt(hellos.length);
    //String randomHellos = (hellos[idx]);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("counter", loadCounter.getAndIncrement());
        int idx = new Random().nextInt(hellos.length);
        model.addAttribute("hello", (hellos[idx]));
        return "greeting";
    }


}
