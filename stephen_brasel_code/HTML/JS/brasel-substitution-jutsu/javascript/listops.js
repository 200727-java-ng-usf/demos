var ages = [520, 790, 651, 900];

var agesInYears = [];
for (let i = 0; i < ages.length; i++) {
	let inYears = ages[i];
	agesInYears.push(inYears);
}

var agesInYearsMap = ages.map((value, index, array) => value/12);
var agesInYearsMap = ages.map((haha) => haha/12);

var agesBelow700 = ages.filter((value) => value < 700);
var agesBelow700func = ages.filter(function(value));


