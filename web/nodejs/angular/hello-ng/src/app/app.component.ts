import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
<<<<<<< HEAD
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'hello-ng';
  showStructural = false;
  showAttribute = false;
  showPipes = false;
  showLogin = true;
  title = "hello-ng";
=======
  // template: `<h1>We can include HTML templates inline if desired (not recommended)</h1>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  showStructural = false;
  showAttribute = false;
  showPipes = false;
  showLogin = false;
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

  show(whatToShow: string) {
    switch (whatToShow) {
      case 'structural':
        this.showAttribute = false;
        this.showPipes = false;
        this.showLogin = false;
        this.showStructural = true;
        break;
      case 'attribute':
<<<<<<< HEAD
        this.showAttribute = true;
        this.showPipes = false;
        this.showLogin = false;
        this.showStructural = false;
        break;
      case 'pipes':
        this.showAttribute = false;
        this.showPipes = true;
        this.showLogin = false;
        this.showStructural = false;
        break;
      case 'login':
        this.showAttribute = false;
        this.showPipes = false;
        this.showLogin = true;
        this.showStructural = false;
        break;
      default:
        this.showAttribute = false;
        this.showPipes = false;
        this.showLogin = false;
        this.showStructural = false;
    }
  }
=======
        this.showStructural = false;
        this.showPipes = false;
        this.showLogin = false;
        this.showAttribute = true;
        break;
      case 'pipes':
        this.showAttribute = false;
        this.showStructural = false;
        this.showLogin = false;
        this.showPipes = true;
        break;
      case 'login':
        this.showAttribute = false;
        this.showStructural = false;
        this.showPipes = false;
        this.showLogin = true;
        break;
      default:
        this.showAttribute = false;
        this.showStructural = false;
        this.showPipes = false;
    }
  }

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
}
