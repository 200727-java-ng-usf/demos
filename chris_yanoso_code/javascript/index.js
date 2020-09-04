
function changeColor(){
     this.style.background = "red";
    }
function changeColorBack(){
    this.style.background = "white";
    }
    for (i = 0; i < 9; i++){
        document.getElementsByClassName("tableDiv")[i].addEventListener("mouseleave", changeColorBack)
        document.getElementsByClassName("tableDiv")[i].addEventListener("mouseenter", changeColor)
    }