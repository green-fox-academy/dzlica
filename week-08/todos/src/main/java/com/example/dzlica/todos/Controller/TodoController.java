package com.example.dzlica.todos.Controller;

import com.example.dzlica.todos.Repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
