package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Blog;
import com.mycompany.myapp.domain.BlogPostRequestBody;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Repository
public class BlogRepository {
    private MongoTemplate mongoTemplate;

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

    public String addBlog(MultipartFile multipart, BlogPostRequestBody blogPostRequestBody) {
        try {
            Blog postReq = new Blog();
            postReq.setBlogTitle(blogPostRequestBody.getBlogTitle());
            postReq.setBlogDescription(blogPostRequestBody.getBlogDescription());
            postReq.setBlogImage(new Binary(BsonBinarySubType.BINARY, multipart.getBytes()));
            mongoTemplate.insert(postReq, BLOG);
            return "success";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "failed";
        }
    }
}
