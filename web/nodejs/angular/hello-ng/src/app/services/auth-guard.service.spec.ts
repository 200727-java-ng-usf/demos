<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';
import { Router } from '@angular/router';
=======
import { TestBed } from '@angular/core/testing';
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

import { AuthGuardService } from './auth-guard.service';

describe('AuthGuardService', () => {
  let service: AuthGuardService;

  beforeEach(() => {
<<<<<<< HEAD
    TestBed.configureTestingModule({
      imports: [ HttpClientModule, Router ]
    });
=======
    TestBed.configureTestingModule({});
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    service = TestBed.inject(AuthGuardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
