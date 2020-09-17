import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FirstComponent } from './first/first.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { PipesComponent } from './pipes/pipes.component';
import { QuizComponent } from './quiz/quiz.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';

const routes: Routes = [
  {
    path: '', component: FirstComponent,
  }, {
    path: 'login', component: LoginComponent,
  },
  {
    path: 'structural', component: StructuralDirectivesComponent,
  },
  {
    path: 'attribute', component: AttributeDirectivesComponent,
  },
  {
    path: 'pipes', component: PipesComponent,
  },
  {
    path: 'quiz', component: QuizComponent,
  },
  {
    path: 'dashboard', component: DashboardComponent,
  },
  {
    path: '**', component: NotFoundComponent, 
  } // wildcards should ALWAYS GO LAST.
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
