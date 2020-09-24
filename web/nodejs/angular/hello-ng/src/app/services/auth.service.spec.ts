<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
=======
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
import { TestBed } from '@angular/core/testing';

import { AuthService } from './auth.service';

describe('AuthService', () => {
  let service: AuthService;

  beforeEach(() => {
<<<<<<< HEAD
    TestBed.configureTestingModule({
      imports: [ HttpClientModule ]
    });
=======
    TestBed.configureTestingModule({});
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    service = TestBed.inject(AuthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
