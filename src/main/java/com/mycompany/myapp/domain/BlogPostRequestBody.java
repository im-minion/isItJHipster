package com.mycompany.myapp.domain;

import java.io.File;
import java.io.Serializable;

public class BlogPostRequestBody implements Serializable {
    private String blogTitle;
    private String blogDescription;
    private File file;

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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
