<<<<<<< HEAD
import { Component } from '@angular/core';
=======
import { Component, OnInit } from '@angular/core';
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {

  title = '';
<<<<<<< HEAD
=======

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  examplePerson = {
    firstName: '',
    lastName: ''
  }

  updatePerson() {
    this.examplePerson = {
<<<<<<< HEAD
      firstName: this.examplePerson.firstName,
      lastName: this.examplePerson.lastName
=======
      firstName: 'default',
      lastName: 'person'
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    }
  }

}
