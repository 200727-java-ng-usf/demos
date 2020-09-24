<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
=======
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuizComponent } from './quiz.component';

describe('QuizComponent', () => {
  let component: QuizComponent;
  let fixture: ComponentFixture<QuizComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
<<<<<<< HEAD
      declarations: [QuizComponent],
      imports: [ HttpClientModule ]
=======
      declarations: [ QuizComponent ]
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
