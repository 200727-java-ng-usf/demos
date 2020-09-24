import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent {

  // ngIf demo
  condition = true;
<<<<<<< HEAD
  anotherCondition = false;
=======
  anotherCondition = true;
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

  changeCondition() {
    this.condition = !this.condition;
    this.anotherCondition = !this.anotherCondition;
  }

<<<<<<< HEAD
  // ---------------------------------------

  people: string[] = [
=======
  //----------------------------------------

  people = [
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    'Wezley',
    'Troy',
    'Farren',
    'Chris',
    'Mia',
    'Eli',
    'Daniel',
    'Daniela',
    'Sean',
    'Gu',
    'Michael',
    'Stephen'
  ]

  monsters = [
    {
      name: 'Nessie',
      location: 'Loch Ness, Scotland'
    },
    {
      name: 'Bigfoot',
      location: 'Pacific Northwest, USA'
    },
    {
      name: 'Godzilla',
<<<<<<< HEAD
      location: 'Tokyo'
    },
  ]

  // ---------------------------------------

  time: string = '';
  // night;
=======
      location: 'Tokyo, Japan'
    }
  ]

  //-----------------------------------------
  
  // ngSwitch demo

  time: string = '';

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  changeTimeOfDay(desiredTime: string) {
    this.time = desiredTime;
  }

}
