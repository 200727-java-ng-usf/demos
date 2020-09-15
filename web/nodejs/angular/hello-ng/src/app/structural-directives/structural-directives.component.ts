import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent {

  // ngIf demo
  condition = true;
  anotherCondition = false;

  changeCondition() {
    this.condition = !this.condition;
    this.anotherCondition = !this.anotherCondition;
  }

  // ---------------------------------------

  people: string[] = [
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
      location: 'Tokyo'
    },
  ]

  // ---------------------------------------

  time: string = '';

  changeTimeOfDay(desiredTime: string) {
    this.time = desiredTime;
  }

}
