package com.greenfox.dzlica.materialreview.controllers;

import com.greenfox.dzlica.materialreview.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")

    public Greeting heyThere(@RequestParam("name") String name) {
        Greeting myGreeting = new Greeting(1, "Hello, ", name);
        return myGreeting;
    }
}
