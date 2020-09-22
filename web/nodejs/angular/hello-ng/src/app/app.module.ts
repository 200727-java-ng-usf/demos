import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthorsComponent } from './authors/authors.component';
import { FirstComponent } from './first/first.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TitleCasePipe } from './util/title-case.pipe';
import { PipesComponent } from './pipes/pipes.component';
import { PureJsonPipe } from './util/pure-json.pipe';
import { LoginComponent } from './login/login.component';
import { NavComponent } from './nav/nav.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NotFoundComponent } from './not-found/not-found.component';
import { QuizComponent } from './quiz/quiz.component';
import { HttpClientModule } from '@angular/common/http';
import { DashboardComponent } from './dashboard/dashboard.component';

@NgModule({
  // Configure the selectors
  declarations: [
    AppComponent,
    AuthorsComponent,
    FirstComponent,
    StructuralDirectivesComponent,
    AttributeDirectivesComponent,
    TitleCasePipe,
    PipesComponent,
    PureJsonPipe,
    LoginComponent,
    NavComponent,
    NotFoundComponent,
    QuizComponent,
    DashboardComponent
  ],
  // Generate the host factory
  entryComponents: [], 
  // composing NgModules together
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NgbModule,
    HttpClientModule
  ],
  exports: [], // making NgModules available to other parts of the app
  // Runtime, or injector configuration
  // Runtime injector configuration
  providers: [],
  // Bootstrap
  bootstrap: [AppComponent]
})
export class AppModule { }
