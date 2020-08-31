
function getPokemonFetch() {
    var pokemon;
    // Send a GET request to this endpoint
    fetch("https://pokeapi.co/api/v2/pokemon/charmander")
        // This Promise returns the Object in the body
        .then(response => { return response.json(); })
        // Then we do something with that Object, called data here
        .then(data => { 
            console.log(data); 
            pokemon = data;

            var paragraph = document.querySelector("p");
            paragraph.textContent = pokemon.abilities[0].ability.name;

            return; 
        } )
        .catch(exception => console.log(exception));

        // Fetch -> gets us a Promise with a HTTP response
        // .then
        // response.json() -> gets us a Promise with the Object in its body
        // .then
        // do something with that Object
}

function fetchPost() {
    fetch("http//mywebsite.com/post", {
        method: "POST"
    })
}

// Ajax style
function getPokemonAjax() {
    var req = new XMLHttpRequest();
    req.onreadystatechange = function() {
        if (req.readyState == 4) { 
            pokemon = req.response;

            var paragraph = document.querySelector("p");
            paragraph.textContent = pokemon.abilities[0].ability.name;
        }
    }
    req.responseType = "json";

    req.open("GET", "https://pokeapi.co/api/v2/pokemon/charmander", true);
    req.send();
}

//getPokemonFetch();
getPokemonAjax();