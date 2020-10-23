import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent {

  //ngif demo
  condition: boolean = false;

  changeCondition() {
    this.condition = !this.condition;
  }
  //-------------------------------------

}
