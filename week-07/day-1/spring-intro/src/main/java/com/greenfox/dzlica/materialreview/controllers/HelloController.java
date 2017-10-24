package com.greenfox.dzlica.materialreview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController {
    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
