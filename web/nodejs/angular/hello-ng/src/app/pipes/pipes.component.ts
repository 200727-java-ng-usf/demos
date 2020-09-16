import { Component } from '@angular/core';

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
      firstName: this.examplePerson.firstName,
      lastName: this.examplePerson.lastName
    }
  }

}
