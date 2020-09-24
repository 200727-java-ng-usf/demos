import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FirstComponent } from './first/first.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { PipesComponent } from './pipes/pipes.component';
import { QuizComponent } from './quiz/quiz.component';
import { AuthGuardService } from './services/auth-guard.service';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';

const routes: Routes = [
<<<<<<< HEAD
  {
    path: '', component: FirstComponent,
  }, {
    path: 'login', component: LoginComponent,
  },
  {
    path: 'structural', component: StructuralDirectivesComponent, canActivate: [AuthGuardService],
  },
  {
    path: 'attribute', component: AttributeDirectivesComponent, canActivate: [AuthGuardService],
  },
  {
    path: 'pipes', component: PipesComponent, canActivate: [AuthGuardService],
  },
  {
    path: 'quiz', component: QuizComponent, canActivate: [AuthGuardService],
  },
  {
    path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuardService],
  },
  {
    path: '**', component: NotFoundComponent, 
  } // wildcards should ALWAYS GO LAST.
=======
  { path: '', component: FirstComponent },
  { path: 'login', component: LoginComponent },
  { path: 'structural', component: StructuralDirectivesComponent, canActivate: [AuthGuardService]  },
  { path: 'attribute', component: AttributeDirectivesComponent, canActivate: [AuthGuardService]  },
  { path: 'pipes', component: PipesComponent, canActivate: [AuthGuardService]  },
  { path: 'quiz', component: QuizComponent, canActivate: [AuthGuardService] },
  { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuardService] },
  { path: '**', component: NotFoundComponent } // wildcard routes should ALWAYS go last
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
