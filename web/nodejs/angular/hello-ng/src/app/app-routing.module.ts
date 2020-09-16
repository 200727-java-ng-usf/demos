import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { FirstComponent } from './first/first.component';
import { LoginComponent } from './login/login.component';
import { PipesComponent } from './pipes/pipes.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';

const routes: Routes = [
  { path: '', component: FirstComponent},
  { path: 'login', component: LoginComponent},
  { path: 'structural', component: StructuralDirectivesComponent},
  { path: 'attribute', component: AttributeDirectivesComponent},
  { path: 'pipes', component: PipesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
