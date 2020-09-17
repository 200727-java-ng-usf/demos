import { Component, OnInit } from '@angular/core';
import { QuizService } from '../services/quiz.service';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

  constructor(private quizService: QuizService){ }

  questions = [];

  async ngOnInit() {
    let quizQuestions = <Object[]> await this.quizService.getQuestions();

    for (let question of quizQuestions) {
      this.questions.push(question);
    }

  }

  toArray(answers: object) {
    return Object.keys(answers).map(key => answers[key]);
  }

  loadQuestions() {
  }

}
