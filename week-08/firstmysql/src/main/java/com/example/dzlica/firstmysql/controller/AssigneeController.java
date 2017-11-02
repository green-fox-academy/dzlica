package com.example.dzlica.firstmysql.controller;

import com.example.dzlica.firstmysql.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
    @Autowired
    AssigneeRepo assigneeRepo;

    @RequestMapping({"/"})
    public String list(Model model) {
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "assignee";
    }


}
