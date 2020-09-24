import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directives',
  templateUrl: './attribute-directives.component.html',
  styleUrls: ['./attribute-directives.component.css']
})
export class AttributeDirectivesComponent {

  isDisabled = true;
  name = 'something';
  selectedColor = 'green';
<<<<<<< HEAD
  colors = [
    'red',
    'orange',
    'yellow',
    'green',
    'blue',
    'indigo',
    'violet'
  ]
  classes = [
    {
      className: 'font-weight-bold', // Bootstrap class name
      displayName: 'bold' // Name to render for the user on the DOM
=======
  colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

  classes = [
    {
      className: 'font-weight-bold', // Bootstrap class name
      displayName: 'bold' // Name to rendered for the user on the DOM
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    },
    {
      className: 'font-italic',
      displayName: 'italic'
    },
    {
      className: 'mark',
      displayName: 'highlight'
    }
<<<<<<< HEAD
  ]
=======
  ];
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

  selectedClasses: string[] = [];

  enabler() {
    this.isDisabled = !this.isDisabled;
  }

  addClasses($event) {
<<<<<<< HEAD
=======
    
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    this.selectedClasses = [];

    for (let option of $event.target.selectedOptions) {
      this.selectedClasses.push(option.value);
    }
<<<<<<< HEAD
    console.log(this.selectedClasses);
  }
  
=======

    console.log(this.selectedClasses);

  }
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

}
