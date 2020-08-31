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

function getPokemon(){
    var req = new XMLHttpRequest();
    
}