import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loginForm: FormGroup;

  submitted = false;
  loading = false;

  constructor(private formbuilder: FormBuilder, private authService: AuthService, private router: Router) {
    console.log('LoginComponent instantiating...');
    console.log('LoginComponent instantiating complete.');
   }

  ngOnInit(): void {
    console.log('Initalizing form values for LoginComponent........')
    this.loginForm = this.formbuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
    console.log('Login component form value initalization complete.');

  }

  get formFields() {
    return this.loginForm.controls
  }

  login() {
    this.submitted = true;

    if (this.loginForm.invalid) return;

    this.loading = true;
    
    this.authService.authenticate(this.formFields.username.value, this.formFields.password.value)
                        .subscribe(
                          () => {
                            this.loading = false;
                            console.log('login-successful');
                            console.log('Navigating to dashboard...');
                            this.router.navigate(['/dashboard']);
                          },
                          err => {
                            console.log(err);
                            this.loading = false;
                            this.submitted = false;
                          }
                        );

  }

}