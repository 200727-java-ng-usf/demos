//hoisting declares variables as undefined within their scope in the first-pass, 
// then on the second pass using the written code to declare/instantiate.

console.log(myVariable);
var myVariable = "Look, I'm undefined!";

console.log("Global variable: " + globalVariable);

var myFunc = function(){
	// var funcVariable
	// var ifVariable

	console.log("Func variable: " + funcVariable);
	console.log("If variable: " + ifVariable);
	var funcVariable = "In function!";

	if(true){
		var ifVariable = "If block!";
	}
} ();

var globalVariable = "Global variable!";