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
    public String list(Model model, @RequestParam (required = false) boolean isActive) {
        if (!isActive) {
            model.addAttribute("todos", todoRepo.findAll());
        }
        if (isActive) {
            model.addAttribute("todos", todoRepo.findAllByDoneIsFalse());
        }

        return "todo";
    }

    @GetMapping(value="/add")
    public String addTodo(Model model) {
        model.addAttribute("addtodo", new Todo());
        return "add";
    }

    @PostMapping("/add")
    public String postTodo(@ModelAttribute Todo todo, Model model) {
        todoRepo.save(todo);
        model.addAttribute("todos", todoRepo.findAll());
        return "todo";
    }


}
