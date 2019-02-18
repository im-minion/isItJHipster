import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { IsItSharedModule } from 'app/shared';
import { HOME_ROUTE, HomeComponent } from './';
import { BlogHomeComponent } from './blog-home/blog-home.component';

@NgModule({
    imports: [IsItSharedModule, RouterModule.forChild([HOME_ROUTE])],
    declarations: [HomeComponent, BlogHomeComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class IsItHomeModule {}
