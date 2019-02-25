import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'jhi-blog-card',
    templateUrl: './blog-card.component.html',
    styles: []
})
export class BlogCardComponent implements OnInit {
    @Input() blogData: any;
    imageBlobUrl: any;
    constructor() {}

    ngOnInit() {}

    dataURItoBlob(dataURI) {
        const byteString = atob(dataURI.data);
        const arrayBuffer = new ArrayBuffer(byteString.length);
        const int8Array = new Uint8Array(arrayBuffer);
        for (let i = 0; i < byteString.length; i++) {
            int8Array[i] = byteString.charCodeAt(i);
        }
        const blob = new Blob([arrayBuffer], { type: 'image/jpeg' });
        return this.createImageFromBlob(blob);
    }

    createImageFromBlob(image: Blob) {
        const reader = new FileReader();
        reader.addEventListener(
            'load',
            () => {
                this.imageBlobUrl = reader.result;
                return this.imageBlobUrl;
            },
            false
        );
        if (image) {
            reader.readAsDataURL(image);
            return this.imageBlobUrl;
        }
    }
}
