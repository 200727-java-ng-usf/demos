function changeColor(event){
	var randomColor = '#'+Math.floor(Math.random()*16777215).toString(16);
	this.style.backgroundColor = randomColor;
	console.log("enter");
} 
function resetColor(event){
	this.style.backgroundColor = "white";
	console.log("leave");
}
var blocks = document.querySelectorAll("td");
console.log(blocks);
blocks.forEach( e => {
	console.log(e);
	e.addEventListener("mouseenter", changeColor);
	e.addEventListener("mouseleave", resetColor);}
);
console.log(blocks);