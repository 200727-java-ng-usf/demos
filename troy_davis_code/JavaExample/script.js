function changeTheText(parrot){
    var e = document.getElementById("my_paragraph");
    e.textContent= "Text changed";
    
    console.log(parrot.detail);
}
var but = document.querySelector("input");


but.addEventListener("click", changeTheText);
console.log(but);

function getImage(){
    
    var pokemon;
    fetch('https://pokeapi.co/api/v2/pokemon/ditto')
    .then(response =>{return response.json(); })
    .then(data => {
        console.log(data);
        pokemon = data;
    
    var par = document.querySelector("article");
    par.textContent = pokemon.abilities[0].ability.name;

    for(var i = 0; i < 2; i++){
        par.textContent.concat(pokemon.abilities[i].ability.name);
    }

    return;

    });

}
getImage();

const div1 = document.getElementById('1');
const div2 = document.getElementById('2');
const div3 = document.getElementById('3');
const div4 = document.getElementById('4');
const div5 = document.getElementById('5');
const div6 = document.getElementById('6');
const div7 = document.getElementById('7');
const div8 = document.getElementById('8');
const div9 = document.getElementById('9');

div1.addEventListener('mouseover', function (event) {
    div1.setAttribute("style", "background-color: red;");
});
div1.addEventListener('mouseout', function (event) {
    div1.setAttribute("style", "background-color: white;");
});
div2.addEventListener('mouseover', function (event) {
    div2.setAttribute("style", "background-color: grey;");
});
div2.addEventListener('mouseout', function (event) {
    div2.setAttribute("style", "background-color: white;");
});
div3.addEventListener('mouseover', function (event) {
    div3.setAttribute("style", "background-color: yellow;");
});
div3.addEventListener('mouseout', function (event) {
    div3.setAttribute("style", "background-color: white;");
});
div4.addEventListener('mouseover', function (event) {
    div4.setAttribute("style", "background-color: red;");
});
div4.addEventListener('mouseout', function (event) {
    div4.setAttribute("style", "background-color: white;");
});
div5.addEventListener('mouseover', function (event) {
    div5.setAttribute("style", "background-color: black;");
});
div5.addEventListener('mouseout', function (event) {
    div5.setAttribute("style", "background-color: white;");
});
div6.addEventListener('mouseover', function (event) {
    div6.setAttribute("style", "background-color: grey;");
});
div6.addEventListener('mouseout', function (event) {
    div6.setAttribute("style", "background-color: white;");
});
div7.addEventListener('mouseover', function (event) {
    div7.setAttribute("style", "background-color: orange;");
});
div7.addEventListener('mouseout', function (event) {
    div7.setAttribute("style", "background-color: white;");
});
div8.addEventListener('mouseover', function (event) {
    div8.setAttribute("style", "background-color: purple;");
});
div8.addEventListener('mouseout', function (event) {
    div8.setAttribute("style", "background-color: white;");
});
div9.addEventListener('mouseover', function (event) {
    div9.setAttribute("style", "background-color: blue;");
});
div9.addEventListener('mouseout', function (event) {
    div9.setAttribute("style", "background-color: white;");
});


