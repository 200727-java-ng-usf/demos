import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'hello-ng';
  showStructural = false;
  showAttribute = false;
  showPipes = false;

  show(whatToShow: string) {
    switch (whatToShow) {
      case 'structural':
        this.showAttribute = false;
        this.showPipes = false;
        this.showStructural = true;
        break;
      case 'attribute':
        this.showAttribute = true;
        this.showPipes = false;
        this.showStructural = false;
        break;
      case 'pipes':
        this.showAttribute = false;
        this.showPipes = true;
        this.showStructural = false;
        break;
      default:
        this.showAttribute = false;
        this.showPipes = false;
        this.showStructural = false;
    }
  }
}
