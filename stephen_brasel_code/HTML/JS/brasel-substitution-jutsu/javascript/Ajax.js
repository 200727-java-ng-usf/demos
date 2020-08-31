function getPokemon(){
	var pokemon;
	// Send a GET request ot this endpoint
	fetch("https://pokeapi.co/api/v2/pokemon/charmander")
		// This promise returns the Object in the body
		.then(response => response.json())
		// Then we so something with that Object, called data here
		.then(data => {console.log(data); 
			pokemon = data;

			var paragraph = document.querySelector("p");
			paragraph.textContent = pokemon.abilities[0].ability.name;
		
			return;
		});

	// JSON.stringify(name="Jacob");

}

getPokemon();