package com.mycompany.myapp.domain;

import java.io.Serializable;

public class BlogPostRequestBody implements Serializable {
    private String blogTitle;
    private String blogDescription;

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
}
