package com.greenfox.dzlica.reddit.controllers;

import com.greenfox.dzlica.reddit.model.Reddit;
import com.greenfox.dzlica.reddit.repositories.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reddit")
public class RedditController {

    @Autowired
    RedditRepo redditRepo;

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("posts", redditRepo.findAll());
        return "reddit";
    }

    @GetMapping(value="/add")
    public String addPost(Model model) {
        model.addAttribute("addpost", new Reddit());
        return "add";
    }

    @PostMapping("/add")
    public String postTodo(@ModelAttribute Reddit reddit, Model model) {
        redditRepo.save(reddit);
        model.addAttribute("posts", redditRepo.findAll());
        return "reddit";
    }

}
