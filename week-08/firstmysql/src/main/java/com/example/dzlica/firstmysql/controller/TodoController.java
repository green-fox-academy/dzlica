package com.example.dzlica.firstmysql.controller;

import com.example.dzlica.firstmysql.model.Assignee;
import com.example.dzlica.firstmysql.model.Todo;
import com.example.dzlica.firstmysql.repositories.AssigneeRepo;
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

    @Autowired
    AssigneeRepo assigneeRepo;

    @RequestMapping({"/", "/list"})
    public String list(Model model, @RequestParam (required = false) boolean isActive, @RequestParam (required = false) String search) {
        if (!isActive) {
            model.addAttribute("todos", todoRepo.findAll());
            model.addAttribute("assignees", assigneeRepo.findAll());
        }
        if (isActive) {
            model.addAttribute("todos", todoRepo.findAllByDoneIsFalse());
        }
        if (search != null) {
            model.addAttribute("todos", todoRepo.findAllByTitleIsLike("%" + search + "%"));
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

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepo.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable long id) {
        model.addAttribute("edittodo", todoRepo.findOne(id));
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "/edit";
    }

    @PostMapping("/{id}/edit")
    public String editPost(@ModelAttribute Todo todo, @ModelAttribute Assignee assignee) {
        todoRepo.save(todo);
        assigneeRepo.save(assignee);
        return "redirect:/todo/list";
    }

}
