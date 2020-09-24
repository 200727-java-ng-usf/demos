import { Component, OnInit } from '@angular/core';
import { QuizService } from '../services/quiz.service';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

<<<<<<< HEAD
  constructor(private quizService: QuizService){ }
=======
  constructor(private quizService: QuizService) { }
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

  questions = [];

  async ngOnInit() {
    let quizQuestions = <Object[]> await this.quizService.getQuestions();

    for (let question of quizQuestions) {
      this.questions.push(question);
    }
<<<<<<< HEAD

  }

  toArray(answers: object) {
    return Object.keys(answers).map(key => answers[key]);
  }

  loadQuestions() {
=======
  }

  toArray(answers: object) {
    return Object.keys(answers).map(key => answers[key])
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  }

}
