import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { AuthorsComponent } from './authors/authors.component';
=======
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
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
<<<<<<< HEAD
  // Configure the selectors
  declarations: [
    AppComponent,
    AuthorsComponent,
=======
  declarations: [
    AppComponent,
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
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
<<<<<<< HEAD
  // Generate the host factory
  entryComponents: [], 
  // composing NgModules together
=======
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NgbModule,
    HttpClientModule
  ],
<<<<<<< HEAD
  exports: [], // making NgModules available to other parts of the app
  // Runtime, or injector configuration
  // Runtime injector configuration
  providers: [],
  // Bootstrap 
=======
  providers: [],
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  bootstrap: [AppComponent]
})
export class AppModule { }
