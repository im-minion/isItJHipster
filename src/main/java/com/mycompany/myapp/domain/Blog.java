package com.mycompany.myapp.domain;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.Nullable;
import java.io.Serializable;

@Document(collection = "blog")
public class Blog implements Serializable {

    @Field
    private String blogTitle;
    @Field
    private String blogDescription;
    @Field
    private Binary blogImage;
    @Id
    @Nullable
    private String id;

    public Blog() {

    }

    public Blog(String blogTitle, String blogDescription, Binary blogImage, @Nullable String id) {
        this.blogTitle = blogTitle;
        this.blogDescription = blogDescription;
        this.blogImage = blogImage;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

    public Binary getBlogImage() {
        return blogImage;
    }

    public void setBlogImage(Binary blogImage) {
        this.blogImage = blogImage;
    }

    @Override
    public String toString() {
        return "Blog{" +
            "id = " + id +
            "blogTitle = " + blogTitle +
            "blogDescription = " + blogDescription +
            "blogImage = " + blogImage + "}";
    }
}
