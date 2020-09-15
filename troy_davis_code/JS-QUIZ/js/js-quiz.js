window.onload = () => {

    // Dynamically create base HTML elements
    let quizDiv = document.createElement('div');
    let resultsDiv = document.createElement('div');
    let buttonDiv = document.createElement('div');
    let submitBtn = document.createElement('button');

    // Set the attribute of the newly created elements
    quizDiv.setAttribute('id', 'quiz-container');
    resultsDiv.setAttribute('id', 'results-container');
    buttonDiv.setAttribute('id', 'button-container');
    submitBtn.setAttribute('id', 'submit-btn');
    submitBtn.setAttribute('class', 'btn btn-primary');

    // Adjust some styles for button container div
    buttonDiv.style.padding = '.125rem';
    buttonDiv.style.float = 'left';

    // Give the submit button some text to display
    submitBtn.innerText = 'Submit Quiz';

    // Add the divs to the body of the document
    buttonDiv.appendChild(submitBtn);
    document.body.prepend(quizDiv, buttonDiv, resultsDiv);

    // Build the quiz when the page loads
    buildQuiz();

    // Add some ELs to the submit button for grading
    buttonDiv.addEventListener('mouseover', isQuizValid);
    submitBtn.addEventListener('click', showResults);

}

async function buildQuiz() {
    
    let getQuestionFunction = await getQuestion();
    let myQuestions = await getQuestionFunction();
    
    //convenience refference for our quiz container 
    let quizContainer = document.getElementById('quiz-container');

    //create an array to hold html
    const htmlOutput = [];

    /*
        next start building html for each question. will need to loop
        though the questions
    */
   myQuestions.forEach((currentQuestion, questionNumber) => {

    //create an array for styoring the list of answer questions 

    const answers = [];

    //for each anser create some html 

    for (let letter in currentQuestion.answers) {
        answers.push(`
        <label>
            <input type="radio" name="question-${questionNumber}" value="${letter}" />
            ${letter}: ${currentQuestion.answers[letter]}
        </label>
        `);
    }


    // create html for the question thor this q and answers add to html output array
    htmlOutput.push(`
    <br/>
    <div class="question">${currentQuestion.question}</div>
    <div class="answers">${answers.join('')}</div>
    `);

   });
   //combine html into one string 
   quizContainer.innerHTML = htmlOutput.join('');
}

function isQuizValid() {
    let selectedAnswers = document.querySelectorAll('div.answers > label > input[name^="question-"]:checked');
    if (selectedAnswers.length == 4){
        
    }
}

function showResults() {
    
}

async function getQuestion(){
    //makes use of closure
    let myQuestions;
    return async function() {
        if (myQuestions) {
            console.log('questions already existing, returning old questions');
            return myQuestions;
        } else {
            //returns the value rather than the response
            let response = await fetch('https://api.jsonbin.io/b/5f5fb889302a837e95663c95', {
                method: 'GET',
                headers: {
                    'secret-key': '$2b$10$5ByNoV2Moynb1rjMK0dbnuOC0vFUq.N34QN0MWRT8VTlCCyRCutE6'
                }
            });
            myQuestions = await response.json();
            console.log(myQuestions);
            return myQuestions;
            // responsePromise.then(resp => {
            //     let bodyDataPromise = resp.json();
            //     myQuestions = bodyDataPromise.then()
            // }).catch(err => {
            //     console.err(err);
            // })
        }
    }
}