<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
=======
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
import { TestBed } from '@angular/core/testing';

import { QuizService } from './quiz.service';

describe('QuizService', () => {
  let service: QuizService;

  beforeEach(() => {
<<<<<<< HEAD
    TestBed.configureTestingModule({
      imports: [ HttpClientModule ]
    });
=======
    TestBed.configureTestingModule({});
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    service = TestBed.inject(QuizService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
