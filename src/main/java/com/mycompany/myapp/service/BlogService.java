package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.repository.BlogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private BlogRepository blogsRepository;

    public List<Blog> getAllBlogs() {

        return this.blogsRepository.findAllBlogs();
//        return ;
    }

    public List<Blog> getSpecificBlogById(String id) {
        return this.blogsRepository.findSpecificBlogById(id);
    }

//     public void addBlog(Blog blog) {
//        blogsRepository.findAllBlogs();
//
//    }

}
