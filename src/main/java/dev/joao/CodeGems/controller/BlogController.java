package dev.joao.CodeGems.controller;

import dev.joao.CodeGems.model.Post;
import dev.joao.CodeGems.services.BlogService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDate;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    public BlogService blogService;

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

    @GetMapping("/newpost")
    public String getPostForm() {
        return "postForm";
    }

    @PostMapping("/newpost")
    public String savePost(@Valid Post post, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/newpost";
        }
        post.setDate(LocalDate.now());
        blogService.save(post);
        return "redirect:/posts";
    }
}
