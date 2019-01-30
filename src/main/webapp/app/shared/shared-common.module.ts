import { NgModule } from '@angular/core';

import { IsItSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [IsItSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [IsItSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class IsItSharedCommonModule {}
