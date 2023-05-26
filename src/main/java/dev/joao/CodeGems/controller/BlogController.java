package dev.joao.CodeGems.controller;

import dev.joao.CodeGems.model.Post;
import dev.joao.CodeGems.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/posts")
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @GetMapping("/posts/{id}")
    public ModelAndView getFullPostDescription(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("FullPostDescription");
        Post post = blogService.findById(id);
        mv.addObject("post", post);
        return mv;
    }

}
