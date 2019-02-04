package com.mycompany.myapp.service;

import com.mycompany.myapp.config.Constants;
import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.repository.BlogRepository;
import com.mycompany.myapp.service.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    private final BlogRepository blogsRepository;

    BlogService(BlogRepository blogRepository) {
        this.blogsRepository = blogRepository;
    }

    public List<Blog> getAllBlogs() {

        return blogsRepository.findAllBlogs();
//        return ;
    }

//     public void addBlog(Blog blog) {
//        blogsRepository.findAllBlogs();
//
//    }

}
