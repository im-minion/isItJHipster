package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.repository.BlogRepository;
import com.mycompany.myapp.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Component
@RestController
@RequestMapping("/api")
public class BlogResource {

    private final BlogService blogService;
    private final Logger log = LoggerFactory.getLogger(AccountResource.class);

    BlogResource(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public List<Blog> retrieveAllBlogs() {
        final List<Blog> blogList = blogService.getAllBlogs();
        System.out.println(blogList);
        return blogList;
    }

    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.GET)
    public List<Blog> retrieveSpecificBlogWithId(@PathVariable("id") String id) {
        final List<Blog> blog = blogService.getSpecificBlogById(id);
        System.out.println(blog);
        return blog;
    }
}
