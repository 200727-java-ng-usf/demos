import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  loading = false;
  submitted = false;

  constructor(private formBuilder: FormBuilder, private authService: AuthService, private router: Router) {
<<<<<<< HEAD
    console.log('LoginComponent Instantiating...');
    console.log('LoginComponent Instantiation complete.');
  }
  
  ngOnInit(): void{
    console.log('Initializing form values for LoginComponent...');
=======
    console.log('LoginComponent instantiating...');
    console.log('LoginComponent instantiation complete.');
  }

  ngOnInit(): void {

    console.log('Initializing form values for LoginComponent...');

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
<<<<<<< HEAD
    console.log('LoginComponent form value initialization complete.');
=======

    console.log('LoginComponent form value initialization complete.');

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  }

  get formFields() {
    return this.loginForm.controls;
<<<<<<< HEAD
  }

  login() {
    this.submitted = true;
    if (this.loginForm.invalid) return;
    this.loading = true;
    console.log(this.formFields.username.value, this.formFields.password.value);
    this.authService.authenticate(this.formFields.username.value, this.formFields.password.value)
    .subscribe(
      // user successfully logged in, execute the function below
      () => {
        this.loading = false;
        console.log('login successful!');
        console.log('navigating to dashboard...');
        this.router.navigate(['/dashboard']);
      },
      // if an error occurs, execute the function below
      err => {
        console.log(err);
        this.loading = false;
        this.submitted = false;
      },
      () => {
        console.log('Observable complete! ');
        
      }
    )
  }
=======
  }  

  login() {

    this.submitted = true;

    if (this.loginForm.invalid) return;

    this.loading = true;

    this.authService.authenticate(this.formFields.username.value, this.formFields.password.value)
                    .subscribe(
                      // user successfully logged in, execute the function below
                      () => {
                        this.loading = false;
                        console.log('login successful!');
                        console.log('Navigating to dashboard...');
                        this.router.navigate(['/dashboard']);
                      },
                      // if an error occurs, execute the function below
                      err => {
                        console.log(err);
                        this.loading = false;
                        this.submitted = false;
                      },
                      () => {
                        console.log('observable complete!')
                      }
                    );

  }

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
}
