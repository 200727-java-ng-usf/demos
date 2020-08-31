
var e = document.querySelector("input");
var prevText = e.value;
console.log(e);
e.addEventListener("mousedown", changeTheText);
e.addEventListener("mouseup", changeTheTextBack);
var changed = false;

function changeText(event){
	if(!changed){
		changeTheText(event);
	} else{
		changeTheTextBack(event);
	}
	changed = !changed;
}

function changeTheText(event){
	e.value = "Text Changed.";
}

function changeTheTextBack(event){
	e.value = prevText;
}