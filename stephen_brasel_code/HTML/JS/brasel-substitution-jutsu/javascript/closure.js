(function() {}) ();

var five = (function(n) {return n + 1;}) (5);

console.log(five);

var addIncreasing = ( function() {
	var increasingCounter = 0;
	return function() {
		increasingCounter += 1;
		return increasingCounter;
	};
}) ();

// var increasingCounter;

// for (let i = 0; i < array.length; i++) {
// 	var increasingCounter = 0;
// 	return function() { increasingCounter += 1; return increasingCounter;};
	
// }

console.log(addIncreasing()); // Output 1
console.log(addIncreasing()); // Output 2

var addEverMore = ( function(){
	var everIncreasingAdd = 0;
	var returnVal = function(num) {
		everIncreasingAdd += 1; 
		return num + everIncreasingAdd;
	};
	return returnVal;
})

var func = addEverMore();
console.log(func(5)); //Output: 6
console.log(func(5)); //Output: 7

console.log(addEverMore(5)); // Output: 6
console.log(addEverMore(5)); // Output: 6