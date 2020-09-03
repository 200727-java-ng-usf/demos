// Fetch
function getPokemonFetch(){
	var pokemon;
	// Send a GET request ot this endpoint
	var textBlock = document.querySelector("#pokeInput");
	var path = "https://pokeapi.co/api/v2/pokemon/" + textBlock.value;
	fetch(path)
		// This promise returns the Object in the body
		.then(response => response.json())
		// Then we so something with that Object, called data here
		.then(data => {console.log(data); 
			pokemon = data;

			var paragraph = document.querySelector("p");
			paragraph.innerHTML = "";
			for(var i = 0; i < pokemon.abilities.length; i++){
				paragraph.innerHTML += pokemon.abilities[i].ability.name;
				if(i < pokemon.abilities.length - 1){
					paragraph.innerHTML += "<br />";
				}
			}
			// paragraph.textContent = pokemon.abilities[0].ability.name;
			var newElem = document.createElement("img");
			newElem.src = pokemon.sprites.front_default;
			//+ " alt=\"" + textBlock.value + "\">");
			paragraph.appendChild(newElem);
		
			return;
		})
		.catch(exception => console.log(exception));
}

var button = document.querySelector("#buttonA");
button.addEventListener("click", getPokemonFetch);

// function getPokemonFetchPost(){
// 	var pokemon;
// 	fetch("https://pokeapi.co/api/v2/pokemon/charmander", {
// 		method: "POST"
// 	})
// 		.then(response => response.json())
// 		.then(data => {console.log(data); 
// 			pokemon = data;

// 			var paragraph = document.querySelector("p");
// 			paragraph.textContent = pokemon.abilities[0].ability.name;
		
// 			return;
// 		})
// 		.catch(exception => console.log(exception));
// }

// getPokemonFetchPost();

// Ajax 
// function getPokemonAjax(){
// 	var pokemon;
// 	var req = new XMLHttpRequest;
// 	req.onreadystatechange = function(){
// 		// Ajax Ready States
// 		//0:UNSENT
// 		//1:OPENED
// 		//2:HEADERS_RECEIVED
// 		//3:LOADING
// 		//4:DONE
// 		if(req.readyState == 4){
// 			pokemon = req.response;
// 			var paragraph = document.querySelector("p");
// 			paragraph.textContent = pokemon.abilities[0].ability.name;
// 		}
// 	}
// 	req.responseType = "json";
// 	req.open("GET", "https://pokeapi.co/api/v2/pokemon/charmander", true);
// 	req.send();
// }

// getPokemonAjax();
