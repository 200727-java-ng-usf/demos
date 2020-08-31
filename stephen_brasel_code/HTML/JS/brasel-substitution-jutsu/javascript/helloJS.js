for(var i =0; i < 50; i++){
	document.write("<br><br>");
	document.write("<article class=\"h"+ (i%3+1) + "\">I'm Mr. Meseeks, look at me! I'm Mr. Meseeks, yessiree!</article>");
}

//I don't need no stinkin' semi colon...
//console.log("look at this console log!!! weeeee!!");
//console.warn("pineapples don't go on pizza, bruh.");
//console.error("oh no... My battery is getting low, and it's growing dark...");
//alert("Do you have tree fiddy?");

//What is console.log?
// is it a basic functionality in JavaScript(JS) that prints text too the console of your browser
// console.log("Hello, world!");
/*

*/

//do you NEED the semicolon? no.
// Is it a good idea? yes. By convention and keep in mind that even JS can make a mistake.
// console.log("Hello, again!");

/**
* What is the difference between a primitive and reference datatype?
* -a primitive is a single data value. It doesn't have any behavior, just a single state
* -a reference type is a variable that erefers to a GROUP of states and/or behaviors.
* 
* PRIMITIVE DATATYPES in JavaScript 
* -boolean
* -number
* -string
* -null
* -undefined
* (in the latest ECMAScript there are BigInt and Symbols) 
* 
* ECMAScript is essentially a third party standard for scripting languages
* ECMAScript2015 (aka ES6) may add some features to scripting languages 
* 
*/
var num = 5; 								//number
// num="hola";
var numTwo;									//undefined
//numThree 
var name = 'Billy "The Warden"'; 			//string
var nameTwo = "'Other' \"String\" `Here`";	//string
var nameThree = `This is weird`;			//string
var isApproved = true 						//boolean
var noMansLand = undefined					//undefined
	//undefined is used like a SYSTEM DEFINED "null" value
var nothing = null;							//null
	// null is used like a USER DEFINED "null" value


/*
REFERENCE DATATYPES in JavaScript

	-objects
	-arrays
	-functions
		Method 		- a block of code that executes within an object.
		Function 	- a block of code that executes.
*/

//how do we create an object in JS
var exampleObject = {}; //curly braces

//ANOTHER object
var exampleObjectAgain = {
	"firstField": 15,
	'secondField': "Barnacles",
	thirdField: ()=>{},
	"fourthField": [25, "hola", "ohayou"],
	"fifthField":{
		"subField1":52,
	},
	sixthField: 30,
	// `seventhField`:"hola"			//WON'T work with backtiks
}
console.log(exampleObjectAgain.secondField);
console.log(exampleObjectAgain.sixthField);
console.log("FIRST");
console.log(exampleObjectAgain.tenthField);
exampleObjectAgain.tenthField = "will this work?";
console.log(exampleObjectAgain.tenthField);
console.log("SECOND");

//how do we create an array in JS
var exampleArray = []; //square brackets

//how do we create a function

function exampleFunction(varOne, varTwo){
	console.log("in first function");
};
exampleFunction(5, 10);

var exampleFunctionAgain = function(){
	console.log("in second function");
};
exampleFunctionAgain();
var passDaFunc = exampleFunctionAgain;
passDaFunc();

var exampleFunctionAThirdTime = () => {console.log("What in the..... ?");};
exampleFunctionAThirdTime();

/*
what are these called?
	()	parentheses
	[]	square brackets (sometimes just brackets)
	<>	angle brackets, diamond brackets, (hard brackets,) chevrons
	{}	curly braces, curly brackets

	` 	backtik
	# 	octothorpe, pound sign, hashtag, number sign
*/

console.log(25*"5");

/*
	TYPEOF operator

	-typeof returns a string that describes the datatypes of the argument

*/
console.log(typeof(num));
console.log(typeof(numTwo));
console.log(typeof(nameThree));
console.log(typeof(isApproved));
console.log(typeof(noMansLand));
console.log(typeof(nothing)); 			//prints object

console.log("\n\n");
console.log(typeof(exampleObject));
console.log(typeof(exampleArray));
console.log(typeof(exampleFunction));

console.log(typeof(NaN));

/*NUMERIC PRECISION IN JAVASCRIPT (and honestly, other languages as well)
*/

console.log(1.1+1); //print
console.log(1.1+1.3); //print 2.4000000000000004
var precision = 1.1+1.3
console.log(precision.toFixed(6)); //prints 2.40, toFixed(n) rounds to the n places

// var globalLevel = 9;
// function myFunc(){
// 	var functionLevel = 10;

// 	if(functionLevel){

// 	}
// }
var elems = document.getElementsByTagName("header");
console.log(typeof(elems));