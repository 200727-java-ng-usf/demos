import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  constructor(private http: HttpClient) { 

  }

  async getQuestions() {
    return this.http.get('https://api.jsonbin.io/b/5f5fb889302a837e95663c95', {
      headers: {
        'secret-key': '$2b$10$5ByNoV2Moynb1rjMK0dbnuOC0vFUq.N34QN0MWRT8VTlCCyRCutE6',
      },
    }).toPromise(); // by default, gets an observable. We convert it 
  }
}
