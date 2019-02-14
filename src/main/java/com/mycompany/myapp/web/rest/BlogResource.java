package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.domain.BlogPostRequestBody;
import com.mycompany.myapp.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
        return blogService.getAllBlogs();
    }

    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.GET)
    public List<Blog> retrieveSpecificBlogWithId(@PathVariable("id") String id) {
        final List<Blog> blog = blogService.getSpecificBlogById(id);
        System.out.println(blog);
        return blog;
    }

    @PostMapping(value = "/blogs")
    public String insertBlog(@RequestParam("file") MultipartFile multipart, @RequestParam("blogImage") String blogImage, @RequestParam("blogTitle") String blogTitle, @RequestParam("blogDescription") String blogDescription) {
        BlogPostRequestBody blogPostRequestBody = new BlogPostRequestBody();
        blogPostRequestBody.setBlogTitle(blogTitle);
        blogPostRequestBody.setBlogDescription(blogDescription);
        return blogService.postBlog(multipart, blogPostRequestBody);
    }
}
