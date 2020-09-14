//console.log("separation of concerns has been achieved!");


//what is console log?
//it is a basic functionality in JavaScript(JS) that prints text to the console of your browser
//console.log("hello world");

//do you NEEED the semicolon? no.
// is it a good idea? yes. By convention AND keep inmind that even JS can make a mistake
//console.log("hello world, again")


/*

What is the difference between a primitive and reference datatype?
-a primitive is a single data value. It doesn't have any behavior, just a single state
-a reference type is a variable that refers to a GROUP of states and/or behaviors.


PRIMITIVE DATATYPES in JavaScript
-boolean
-number
-string
-null
-undefined
(in the latest ECMAScript there are BigInt & Symbols)

What is ECMAScript is essentially a third party standard for scripting languages.
ECMAScript2015 (aka ES6) may add some features to scripting languages


"var" is a keyword used to declare variables
*/

var num = 5;    //number
//num= "hola";        //JS has ZERO problems reassigning to a new datatype

var numTwo;     //undefined

//numThree      //undeclared

var name= 'Billy "The Warden"';     //string
var nameTwo = "Bob the 'Builder'";   //string
var nameThree = `is this a string? *butterfly meme*`;   //string

var isApproved = false; //boolean

var noMansLand = undefined;     //undefined
    // undefined is used like a SYSTEM DEFINED "null" value

var nothing = null;     //null
    // null is used like a USER DEFINED "null" value


/*
REFERENCE DATATYPES in JavaScript

    -objects
    -arrays
    -functions
*/

//how do we create an object in JS?
var exampleObject = {};

//ANOTHER object
var exampleObjectAgain = {
    "firstField": 25,
    'secondField': "Barnacles",
    "thirdField": ()=>{},
    "fourthField": [25,"hola", "ohayou"],
    "fifthField": {
        "subField1": 52
    },
    sixthField: 30,
    //`seventhField`: "hola"        //WON'T work with backtiks
}
//console.log(exampleObjectAgain.secondField);
//console.log(exampleObjectAgain.sixthField);
console.log("FIRST");
console.log(exampleObjectAgain.tenth);
exampleObjectAgain.tenth = "will this work?";
console.log(exampleObjectAgain.tenth);
console.log("SECOND");

//how do we create an array in JS?
var exampleArray = [];

//how do we create a function in JS?
function exampleFunction(varOne, varTwo){ console.log("in first function")};
//exampleFunction(5, 10);

var exampleFunctionAgain = function () { console.log("in second function")};
//exampleFunctionAgain();
var passDaFunc = exampleFunctionAgain;
//passDaFunc();

var exampleFunctionAThirdTime = () =>{
                                console.log("What in the.....?");
                    };
//exampleFunctionAThirdTime();


/*
what are these called?
    ()   parentheses
    []   square brackets (something just "brackets")
    <>   angle brackets, diamond brackets, chevrons
    {}   curly braces, curly brackets

    `   backtik
    #   octothorpe, pound sign, hashtag, number sign
*/

//console.log(25 * "soifjaij"); //NaN.....Not A Number

/*
    TYPEOF operator

    -typeof returns a string that describes the datatypes of the argument
*/
console.log(typeof(num));
console.log(typeof(numTwo)); //print "undefined"
console.log(typeof(name));
console.log(typeof(isApproved));
console.log(typeof(noMansLand));
console.log(typeof(nothing)); //null print "object"

console.log(typeof(exampleObject));
console.log(typeof(exampleArray));  //prints "object"
console.log(typeof(exampleFunction));

console.log(typeof(NaN));

/*NUMERIC PRECISION IN JAVASCRIPT (and honestly, other languages as well)
*/

console.log(1.1+1)  // print "2.1"
console.log(1.1+1.3) //prints "2.4000000000004", instead of "2.4"

var precision = 1.1+1.3;
console.log(precision.toFixed(2)); //prints 2.40, toFixed(n) rounds to the n places
                    //note: toFixed() retursn a string value, so you may need to do a conversion
                    //  later