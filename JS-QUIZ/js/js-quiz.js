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

function buildQuiz() {
    
}

function isQuizValid() {

}

function showResults() {
    
}

function getQuestions(){

    let myQuestions;

    return function(){
        if(myQuestions) {
            console.log(myQuestions);
            return myQuestions;
        } else {
            let responce = fetch ('https://api.jsonbin.io/b/5f5fb889302a837e95663c95', {
                method: 'GET',
                headers: {
                    'secret-key': '$2b$10$5ByNoV2Moynb1rjMK0dbnuOC0vFUq.N34QN0MWRT8VTlCCyRCutE6'
                }
            });

            responsebodyPromise.then(resp => { // when promise gets fullfilles does below callback method
                let bodyDataPromise = resp.json();
                myQuestions = bodyDataPromise.then
            })

        }
    }
}