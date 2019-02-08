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

    public List<Blog> findAllBlogs() {
        return mongoTemplate.findAll(Blog.class);

    }

    public List<Blog> findSpecificBlogById(String id) {
        Criteria criteria = new Criteria("id").is(id);
        Query query = new Query().addCriteria(criteria);
        return mongoTemplate.find(query, Blog.class, BLOG);
    }

}
