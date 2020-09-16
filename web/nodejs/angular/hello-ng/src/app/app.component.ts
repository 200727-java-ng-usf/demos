import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  // template: `<h1>We can include HTML templates inline if desired (not recommended)</h1>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
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
        this.showStructural = false;
        this.showPipes = false;
        this.showAttribute = true;
        break;
      case 'pipes':
        this.showAttribute = false;
        this.showStructural = false;
        this.showPipes = true;
        break;
      default:
        this.showAttribute = false;
        this.showStructural = false;
        this.showPipes = false;
    }
  }

}
