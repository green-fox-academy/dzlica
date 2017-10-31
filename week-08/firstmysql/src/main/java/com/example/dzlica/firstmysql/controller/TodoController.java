package com.example.dzlica.firstmysql.controller;

import com.example.dzlica.firstmysql.model.Todo;
import com.example.dzlica.firstmysql.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepo.findAll());
        return "todo";
    }

    @GetMapping(value="/add")
    public String addTodo(@RequestParam String title, @RequestParam boolean isUrgent, @RequestParam boolean isDone) {
        todoRepo.save(new Todo(title, isUrgent, isDone));
        return "add";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute TodoRepo todoRepo, Model model) {
        model.addAttribute("added", todoRepo.findAll());
        return "todo";
    }


}
