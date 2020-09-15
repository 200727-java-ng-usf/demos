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

async function buildQuiz() {

	let getQuestionsFunction = await getQuestions();
	let myQuestions = await getQuestionsFunction();
	console.log(myQuestions);

	//Convenience reference for our quiz containre
	let quizContainer = document.getElementById('quiz-container');

	//Create an array which can hold the html of our quiz.
	const htmlOutput = [];

	/*
		Next, we can start building the html for each question. We will 
		need to loop through the questions array. 
	*/

	myQuestions.forEach((currentQuestion, questionNumber) =>{

		// create an array for storing the list of answer choices
		const answers = [];

		//for each available answer create some HTML that will be rendered on the screen 
		for(let letter in currentQuestion.answers){
			answers.push(`
			<label>
				<input type="radio" name="question-${questionNumber}" value="${letter}" />
				${letter}: ${currentQuestion.answers[letter]}
			</label>
			`);
		}

		//create the HTML for this question 
		htmlOutput.push(`
		<br/>
		<div class="questions">${currentQuestion.question}</div>
		<div class="answers">${answers.join('')}</div>
		`);

	});

	quizContainer.innerHTML = htmlOutput.join('');
}

function isQuizValid() {

}

function showResults() {

}

//async await introduced in ES7.
async function getQuestions() {

	let myQuestions;

	return async function () {
		if (myQuestions) {
			console.log('questions already retrieved, returning existing questions.');
			return myQuestions;
		} else {
			console.log('first time request for questions.');
			let response = await fetch('https://api.jsonbin.io/b/5f5fb889302a837e95663c95', {
				method: 'GET',
				headers: {
					'secret-key': '$2b$10$5ByNoV2Moynb1rjMK0dbnuOC0vFUq.N34QN0MWRT8VTlCCyRCutE6'
				}
			});

			myQuestions = await response.json();

			// response.then(resp => {
			// 	let bodyDataPromise = resp.json();
			// 	myQuestions = bodyDataPromise.then();
			// }).catch(err =>{
			// 	console.error(err);
			// })
			return myQuestions;
		}
	}

}
