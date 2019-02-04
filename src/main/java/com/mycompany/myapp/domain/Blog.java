package com.mycompany.myapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Nullable;
import java.io.Serializable;

@Document(collection = "blog")
public class Blog implements Serializable {

    private String blogTitle;
    private String blogDescription;
    private String blogImage;
    @Id
    @Nullable
    private String id;

    public Blog() {

    }
    public Blog(String blogTitle, String blogDescription, String blogImage, @Nullable String id) {
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

    public String getBlogImage() {
        return blogImage;
    }

    public void setBlogImage(String blogImage) {
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
