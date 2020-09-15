( function() { }) ();

var five = ( function() {return n + 1; }) (5);

console.log(five);

var addIncreasing = (function() {
    var increasingCounter = 0;
    return function() { increasingCounter +=1; return increasingCounter; };
}) ();

console.log(addIncreasing());
console.log(addIncreasing());


var addEverMore = ( function() {
    var everIncreasingAdd = 0;
    var returnVal = function(num) { everIncreasingAdd += 1; return num + everIncreasingAdd; };

    return returnVal;
}) 

var func = addEverMore();
console.log(func(5));
console.log(func(5));

//map, filter, reduce