var pokeToSearch = document.querySelector("#pokeName");
var pokePic = document.getElementById("pokePic");
//var pokeDescription = document.getElementById("pokeDescription");


function getImage(){
    
    var pokemon = document.getElementById("pokeName").value;
    var path = "https://pokeapi.co/api/v2/pokemon/" + pokeToSearch.value;
    fetch(path)
        .then(response => response.json() )
        .then(data => {
        console.log(data);
        pokemon = data;
    
        var par = document.querySelector("#pokeDescription");
        par.textContent = pokemon.abilities[0].ability.name;

    
        return;
    })
    .catch(exception => console.log(exception));
    
}

var but = document.querySelector("#submitButton");
but.addEventListener("click", getImage);