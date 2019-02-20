import { Component, OnInit } from '@angular/core';
import { Blog } from '../Blog.model';
import { HttpResponse } from '@angular/common/http';
import { HomeBlogServiceService } from '../home-blog-service.service';

@Component({
    selector: 'jhi-blog-home',
    templateUrl: './blog-home.component.html',
    styles: []
})
export class BlogHomeComponent implements OnInit {
    blogs: Blog[];
    constructor(private blogService: HomeBlogServiceService) {}

    ngOnInit() {
        this.blogService
            .getAllBlogs()
            .subscribe((res: HttpResponse<Blog[]>) => this.onSuccess(res.body), (res: HttpResponse<any>) => this.onError(res.body));
    }
    private onSuccess(data) {
        // this.links = this.parseLinks.parse(headers.get('link'));
        // this.totalItems = headers.get('X-Total-Count');
        this.blogs = data;
        console.log(this.blogs);
    }

    private onError(error) {
        console.log(error);
        // this.alertService.error(error.error, error.message, null);
    }
}
