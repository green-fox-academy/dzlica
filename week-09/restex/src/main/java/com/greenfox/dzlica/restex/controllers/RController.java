package com.greenfox.dzlica.restex.controllers;

import com.greenfox.dzlica.restex.Model.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class RController {

//    @GetMapping("/doubling")
//    public Doubling doub(@RequestParam("input") int input) {
//        Doubling d = new Doubling(input);
//        return d;
//    }

//    @GetMapping("/doubling")
//    public String doubling1(@RequestParam int input) {
//        return "{\n" +
//                "  \"received\": " + input + ",\n" +
//                "  \"result\": " + input * 2 + "\n" +
//                "}";
//    }

    @GetMapping("/doubling")
    public Object doubling2(@RequestParam (required = false) Integer input) {
        if (input == null || input == 0) {
            return new Hiba("Please provide an input!");
        }
        return new Doubling(input, input * 2);
    }

    @GetMapping("/greeter")
    public Object greeterParam(@RequestParam (required = false) String name, @RequestParam (required = false) String title) {
        if (name == null) {
            return new Hiba("Please provide a name!");
        }
        else if (title == null) {
            return new Hiba("Please provide a title!");
        }
        return new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
    }

    @GetMapping("/appenda/{appendable}")
    public AppendA appendParam(@PathVariable (value="appendable") String appendable) {
        return new AppendA(appendable + "a");
    }



//    @GetMapping("/greeter")
//    public Greeter greetParam(@RequestParam("name") String name, @RequestParam("title") String title) {
//        return new Greeter(name, title);
//    }

//    @GetMapping("/appenda/{appendable}")
//    public AppendA appendParam(@PathVariable(value="appendable") String appendable) {
//        return new AppendA(appendable);
//    }

    @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
    public DoUntil dountilParam(@PathVariable String what, @RequestBody Until until) {
        DoUntil doUntil = new DoUntil(until.getUntil(), what);
        return doUntil;
    }

//    @PostMapping("/arrays")
//    public ArrayMethods arrayResult(@RequestBody ArrayHandler arrayHandler) {
//        if (arrayHandler.getWhat().equals("sum")) {
//            ArrayMethods arrayMethods = new ArrayMethods();
//        }
//        return
//    }

//    @ExceptionHandler(MissingServletRequestParameterException.class)
//    public Hiba doubError(MissingServletRequestParameterException missingParam) {
//        Hiba e = new Hiba();
//        if (missingParam.getParameterName().equals("input")) {
//            e.setError("Please provide an input!");
//        }
//        else if (missingParam.getParameterName().equals("name")) {
//            e.setError("Please provide a name!");
//        }
//        else if (missingParam.getParameterName().equals("title")) {
//            e.setError("Please provide a title!");
//        }
//        return e;
//    }



}
