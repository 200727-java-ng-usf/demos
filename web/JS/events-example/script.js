// Put JS code in a separate file to avoid strange behavior and keep HTML, JS clean


function changeTheText(parrot) {
    // Get an element by its id attribute
    var e = document.getElementById("my_paragraph");
    // CHange the paragraph element's text
    e.textContent = "Text changed!";

    // Log the details of the passed-in event object!
    // Here, details is the number of clicks
    console.log(parrot.detail);
}

// We could get element by id here, but a better way is...
//var but = document.getElementById("button");
// Get the element using the query selector!
var but = document.querySelector("input");
// Add the event listener for the click event and call changeTheText(event)
but.addEventListener("click", changeTheText); // Note lack of parentheses for our callback function!
console.log(document);