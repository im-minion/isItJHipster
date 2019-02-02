package com.mycompany.myapp.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Blogs implements Serializable {

    private String blogTitle;
    private String blogDescription;
    private String blogImage;
    @Id
    private String id;

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
        return "Blogs{" +
            "id = " + id +
            "blogTitle = " + blogTitle +
            "blogDescription = " + blogDescription +
            "blogImage = " + blogImage + "}";
    }
}
