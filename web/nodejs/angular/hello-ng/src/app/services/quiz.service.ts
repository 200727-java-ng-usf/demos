import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

<<<<<<< HEAD
  constructor(private http: HttpClient) { 

  }

  async getQuestions() {
    return this.http.get('https://api.jsonbin.io/b/5f5fb889302a837e95663c95', {
      headers: {
        'secret-key': '$2b$10$5ByNoV2Moynb1rjMK0dbnuOC0vFUq.N34QN0MWRT8VTlCCyRCutE6',
      },
    }).toPromise(); // by default, gets an observable. We convert it 
=======
  constructor(private http: HttpClient) {}

  async getQuestions() {
    return await this.http.get('https://api.jsonbin.io/b/5f5fb889302a837e95663c95', {
                                      headers: {
                                        'secret-key': '$2b$10$5ByNoV2Moynb1rjMK0dbnuOC0vFUq.N34QN0MWRT8VTlCCyRCutE6'
                                      }
                                    }).toPromise();
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  }
}
