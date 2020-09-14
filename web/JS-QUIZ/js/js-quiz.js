window.onload = () => {
	let quizDiv = document.createElement('div');
	let resultsDiv = document.createElement('div');
	let buttonDiv = document.createElement('div');
	let submitBtn = document.createElement('button');

	// Set the attribute of the newly created elements
	quizDiv.setAttribute('id', 'quiz-container');
	resultsDiv.setAttribute('id', 'results-container');
	buttonDiv.setAttribute('id', 'button-container');
	submitBtn.setAttribute('id', 'submit-container');
	submitBtn.setAttribute('class', 'btn btn-primary');

	// Adjust some styles for button container div
	buttonDiv.style.padding = '.125rem';
	buttonDiv.style.float = 'left';

	//Give the submit button some text to display
	submitBtn.innerText = 'Submit Quiz!';

	buttonDiv.appendChild(submitBtn);
	document.body.prepend(quizDiv, buttonDiv, resultsDiv);

	//Build the quiz when the page loads
	buildQuiz();

	// Add some ELs to the submit button for grading
	buttonDiv.addEventListener('mouseover', isQuizValid);
	submitBtn.addEventListener('click', showResults);
}

function buildQuiz(){

}

function isQuizValid(){

}

function showResults(){

}
