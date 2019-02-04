package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.repository.BlogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BlogRepositoryImpl implements BlogRepository {
    @Override
    public Page<Blog> findAllBlogs(Pageable pageable) {
        Blog blog = new Blog();
        blog.setBlogDescription("sxss");
        blog.setBlogTitle("sss");
        blog.setBlogImage("ii");
        blog.setId("id");
        ArrayList<Blog> list = new ArrayList<>();
        list.add(blog);

        return (Page<Blog>) list;
    }
}
