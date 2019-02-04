package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import java.util.List;
import java.util.Optional;

@Component
@Repository
public interface BlogRepository {

//    Optional<Blog> findAllBlogs();

    Page<Blog> findAllBlogs(Pageable pageable);

//    Blog findOneBlog(String id);
//
//
//
//    Optional<Blog> findOneBy(String resetKey);
//
//    String addBlog(Blog blog);

//    Optional<User> findOneByEmailIgnoreCase(String email);
//
//    Optional<User> findOneByLogin(String login);
//
//    Page<User> findAllByLoginNot(Pageable pageable, String login);
}
