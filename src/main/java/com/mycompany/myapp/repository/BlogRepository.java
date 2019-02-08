package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogRepository {
    MongoTemplate mongoTemplate;

    private static final String BLOG = "blog";

    @Autowired
    public BlogRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    //    Optional<Blog> findAllBlogs();

    public List<Blog> findAllBlogs() {
//        Criteria criteria = new Criteria("id").is(id);
//        Query query = new Query().addCriteria(criteria);
//        return mongoTemplate.find(query,Blog.class,BLOG);
        return mongoTemplate.find(Query.query(new Criteria()),Blog.class,BLOG);

    }

    public List<Blog> findSpecificBlogById(String id) {
        Criteria criteria = new Criteria("id").is(id);
        Query query = new Query().addCriteria(criteria);
        return mongoTemplate.find(query, Blog.class, BLOG);
    }

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
