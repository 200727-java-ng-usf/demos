<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
=======
import { ComponentFixture, TestBed } from '@angular/core/testing';
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

import { LoginComponent } from './login.component';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
<<<<<<< HEAD
      declarations: [LoginComponent],
      imports: [ ReactiveFormsModule, HttpClientModule ]
=======
      declarations: [ LoginComponent ]
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
