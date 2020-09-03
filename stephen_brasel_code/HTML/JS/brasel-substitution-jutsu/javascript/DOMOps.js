
// var e = document.querySelector("input");
// var prevText = e.value;
// console.log(e);
// e.addEventListener("mousedown", changeTheText);
// e.addEventListener("mouseup", changeTheTextBack);
// var changed = false;

// function changeText(event){
// 	if(!changed){
// 		changeTheText(event);
// 	} else{
// 		changeTheTextBack(event);
// 	}
// 	changed = !changed;
// }

// function changeTheText(event){
// 	e.value = "Text Changed.";
// }

// function changeTheTextBack(event){
// 	e.value = prevText;
// }

function changeColor(event){
	//guarantees 6-digit hex value.
	var randomColor = '#'
		+(Math.floor(Math.random()*100) % 16).toString(16)
		+(Math.floor(Math.random()*100) % 16).toString(16)
		+(Math.floor(Math.random()*100) % 16).toString(16)
		+(Math.floor(Math.random()*100) % 16).toString(16)
		+(Math.floor(Math.random()*100) % 16).toString(16)
		+(Math.floor(Math.random()*100) % 16).toString(16)
		;
	this.style.backgroundColor = randomColor;
}

function resetColor(event){
	this.style.backgroundColor = "white";
}

var chicken = document.getEle
var blocks = document.querySelectorAll("td");
console.log(blocks);
blocks.forEach( e => {
	console.log(e);
	e.addEventListener("mouseenter", changeColor);
	e.addEventListener("mouseleave", resetColor);
});
console.log(blocks);

