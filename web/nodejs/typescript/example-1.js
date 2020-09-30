function log(message) {
    console.log(message);
}
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
console.log(myInstance.myVar);
