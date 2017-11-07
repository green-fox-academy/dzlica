package com.greenfox.dzlica.restex.controllers;

import com.greenfox.dzlica.restex.Model.AppendA;
import com.greenfox.dzlica.restex.Model.Doubling;
import com.greenfox.dzlica.restex.Model.Greeter;
import org.springframework.web.bind.MissingServletRequestParameterException;

import org.springframework.web.bind.annotation.*;

@RestController
public class RController {

    @GetMapping("/doubling")
    public Doubling doub(@RequestParam("input") int input) {
        Doubling d = new Doubling(input);
        return d;
    }

    @GetMapping("/greeter")
    public Greeter greetParam(@RequestParam("name") String name, @RequestParam("title") String title) {
        return new Greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public AppendA appendParam(@PathVariable(value="appendable") String appendable) {
        return new AppendA(appendable);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Error doubError(MissingServletRequestParameterException missingParam) {
        Error e = new Error();
        if (missingParam.getParameterName().equals("input")) {
            e.setError("Please provide an input!");
        }
        else if (missingParam.getParameterName().equals("name")) {
            e.setError("Please provide a name!");
        }
        else if (missingParam.getParameterName().equals("title")) {
            e.setError("Please provide a title!");
        }
        return e;
    }



}
