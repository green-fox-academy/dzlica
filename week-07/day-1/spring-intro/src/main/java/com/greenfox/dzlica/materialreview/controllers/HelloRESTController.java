package com.greenfox.dzlica.materialreview.controllers;

import com.greenfox.dzlica.materialreview.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    public AtomicLong idCounter = new AtomicLong(1);

    @RequestMapping(value="/greeting")

    public Greeting heyThere(@RequestParam("name") String name) {
        Greeting myGreeting = new Greeting(idCounter.getAndIncrement(), "Hello, ", name);
        return myGreeting;
    }



}
