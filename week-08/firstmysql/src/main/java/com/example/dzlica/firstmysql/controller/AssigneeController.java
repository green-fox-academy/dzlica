package com.example.dzlica.firstmysql.controller;

import com.example.dzlica.firstmysql.model.Assignee;
import com.example.dzlica.firstmysql.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
    @Autowired
    AssigneeRepo assigneeRepo;

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "assignee";
    }

    @GetMapping("/{id}/editassignee")
    public String edit(Model model, @PathVariable long id) {
        model.addAttribute("editassignee", assigneeRepo.findOne(id));
        return "/editassignee";
    }

    @PostMapping("/{id}/editassignee")
    public String editPost(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/assignee/list";

    }
}
