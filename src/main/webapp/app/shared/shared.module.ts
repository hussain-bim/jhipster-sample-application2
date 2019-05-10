import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import {
  JhipsterSampleApplication2SharedLibsModule,
  JhipsterSampleApplication2SharedCommonModule,
  JhiLoginModalComponent,
  HasAnyAuthorityDirective
} from './';

@NgModule({
  imports: [JhipsterSampleApplication2SharedLibsModule, JhipsterSampleApplication2SharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [JhipsterSampleApplication2SharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterSampleApplication2SharedModule {
  static forRoot() {
    return {
      ngModule: JhipsterSampleApplication2SharedModule
    };
  }
}
