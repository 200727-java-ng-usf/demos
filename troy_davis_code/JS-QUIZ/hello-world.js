"use strict";
exports.__esModule = true;
exports.Principal = void 0;
function printPoint(point) {
    console.log("x = " + point.x + ", y = " + point.y);
}
function printName(x) {
    console.log("Hello, " + x.name);
}
var obj = {
    x: 0,
    y: 0,
    name: "Origin"
};
printPoint(obj);
printName(obj);
var Principal = /** @class */ (function () {
    function Principal() {
    }
    return Principal;
}());
exports.Principal = Principal;
window.onload = function () {
    var cred = new Principal();
};
