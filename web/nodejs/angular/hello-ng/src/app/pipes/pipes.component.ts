import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {

  title = '';

  examplePerson = {
    firstName: '',
    lastName: ''
  }

  updatePerson() {
    this.examplePerson = {
      firstName: 'default',
      lastName: 'person'
    }
  }

}
