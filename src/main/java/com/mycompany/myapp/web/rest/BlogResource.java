package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.repository.BlogRepository;
import com.mycompany.myapp.service.BlogService;
import com.mycompany.myapp.service.dto.UserDTO;
import com.mycompany.myapp.web.rest.util.PaginationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Component
@RestController
@RequestMapping("/api")
public class BlogResource {

    private final BlogService blogService;
    private final BlogRepository blogRepository;
    private final Logger log = LoggerFactory.getLogger(AccountResource.class);

    BlogResource(BlogService blogService, BlogRepository blogRepository) {
        this.blogService = blogService;
        this.blogRepository = blogRepository;
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getAllBlogs(Pageable pageable) {
        final Page<Blog> page = blogService.getAllBlogs(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/blogs");
        System.out.println(page);
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

//    @GetMapping("/users")
//    public ResponseEntity<List<UserDTO>> getAllUsers(Pageable pageable) {
//        final Page<UserDTO> page = userService.getAllManagedUsers(pageable);
//        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/users");
//        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
//    }
}
