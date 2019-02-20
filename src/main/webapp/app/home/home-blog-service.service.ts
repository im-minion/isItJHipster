import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpResponse } from '@angular/common/http';
import { SERVER_API_URL } from '../../app/app.constants';
import { Blog } from './Blog.model';
import { Observable } from 'rxjs';
@Injectable({
    providedIn: 'root'
})
export class HomeBlogServiceService {
    constructor(private http: HttpClient) {}
    getAllBlogs(): Observable<HttpResponse<Blog[]>> {
        const requestURL = SERVER_API_URL + 'api/blogs';

        return this.http.get<Blog[]>(requestURL, {
            observe: 'response'
        });
    }
}
