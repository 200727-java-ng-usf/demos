function log(message: string) {
<<<<<<< HEAD
  console.log(message);
}

let message = "Hello, Typescript!";
=======
    console.log(message);
}

let message = 'Hello, TypeScript!';
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

log(message);

function doSomething() {
<<<<<<< HEAD
  for (let i = 0; i < 5; i++){
    console.log(i);
  }

  // console.log(i);
}

class MyClass {
  private _myVar: string;
  
  // constructor(){}
  constructor(someVar:string ) {
    this._myVar = someVar;
  }

  get myVar() {
    return this._myVar;
  }
}

let myInstance = new MyClass('my value');
console.log(myInstance.myVar);
=======

    for (let i = 0; i < 5; i++) {
        console.log(i);
    }

    console.log(i);

}

class MyClass {

    private _myVar: string;

    constructor(someVar: string) {
        this._myVar = someVar;
    }

    get myVar() {
        return this._myVar;
    }

}

let myInstance = new MyClass('someValue');
console.log(myInstance.myVar);
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
