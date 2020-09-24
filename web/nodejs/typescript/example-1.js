function log(message) {
    console.log(message);
}
<<<<<<< HEAD
let message = "Hello, Typescript!";
log(message);
function doSomething() {
    for (let i = 0; i < 5; i++) {
        console.log(i);
    }
    // console.log(i);
}
class MyClass {
    // constructor(){}
    constructor(someVar) {
        this._myVar = someVar;
    }
    get myVar() {
        return this._myVar;
    }
}
let myInstance = new MyClass('my value');
=======
var message = 'Hello, TypeScript!';
log(message);
function doSomething() {
    for (var i = 0; i < 5; i++) {
        console.log(i);
    }
    console.log(i);
}
var MyClass = /** @class */ (function () {
    function MyClass(someVar) {
        this._myVar = someVar;
    }
    Object.defineProperty(MyClass.prototype, "myVar", {
        get: function () {
            return this._myVar;
        },
        enumerable: false,
        configurable: true
    });
    return MyClass;
}());
var myInstance = new MyClass('someValue');
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
console.log(myInstance.myVar);
