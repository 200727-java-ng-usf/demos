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
  colors = [
    'red',
    'orange',
    'yellow',
    'green',
    'blue',
    'indigo',
    'violet'
  ];
  classes = [
    {
      className: 'font-weight-bold', // Bootstrap class name
      displayName: 'bold' // Name to render for the user on the DOM
    },
    {
      className: 'font-italic',
      displayName: 'italic'
    },
    {
      className: 'mark',
      displayName: 'highlight'
    }
  ];

  selectedClasses: string[] = [];

  enabler() {
    this.isDisabled = !this.isDisabled;
  }

  addClasses($event) {
    
    this.selectedClasses = [];

    for (let option of $event.target.selectedOptions) {
      this.selectedClasses.push(option.value);
    }

    console.log(this.selectedClasses);

  }

}
