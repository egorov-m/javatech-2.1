package com.example.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoweb.service.PostService;

@Controller
public class PostsCreateController {
    @Autowired
    PostService postService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("appName", "Мое супер приложение");
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}
