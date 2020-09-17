"use strict";
exports.__esModule = true;
var example_1 = require("./example");
var user_1 = require("./user");
window.onload = function () {
    var creds = new user_1.Credentials();
    var principal = new example_1.Principal();
    creds.username = 'bill';
    principal.username = 'bob';
    console.log(creds);
    console.log(principal);
};
