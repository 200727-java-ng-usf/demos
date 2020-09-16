import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthorsComponent } from './authors/authors.component';
import { FirstComponent } from './first/first.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { FormsModule } from '@angular/forms';
import { TitleCasePipe } from './util/title-case.pipe';
import { PipesComponent } from './pipes/pipes.component';
import { PureJsonPipe } from './util/pure-json.pipe';

@NgModule({
  declarations: [
    AppComponent,
    AuthorsComponent,
    FirstComponent,
    StructuralDirectivesComponent,
    AttributeDirectivesComponent,
    TitleCasePipe,
    PipesComponent,
    PureJsonPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
