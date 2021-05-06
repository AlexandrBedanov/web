package com.itproger.demo.controllers;


import com.itproger.demo.models.Post;
import com.itproger.demo.repo.PostRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private PostRepoitory postRepoitory;

    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post>posts=postRepoitory.findAll();
        model.addAttribute("posts",posts);
        return "blog";
    }
}
