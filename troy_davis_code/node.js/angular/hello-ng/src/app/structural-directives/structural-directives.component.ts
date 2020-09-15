import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent {

  //ng if demo
  condition = true;

  changeCondition() {
    this.condition = !this.condition;
  };

  // --------------------------------------------------- //

    people = [
      'troy',
      'kaila',
      'ronin'
    ]
    
    monsters = [
      {
        name: 'Nessie',
        location: 'Loch ness, scotland'
      },
      {
        name: 'BigFoot',
        location: 'woods'
      },
      {
        name: 'Gozilla',
        location: 'SC'
      }
    ]

    // -------------------------------------//
    time: string = '';
    changeTimeOfDay(desiredTime: string) {
      this.time = desiredTime;
    };
    
}
