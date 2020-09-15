function log(message: string) {
  console.log(message);
}

let message = "Hello, Typescript!";

log(message);

function doSomething() {
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
