import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
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

  constructor(private formBuilder: FormBuilder, private authService: AuthService) {
    console.log('LoginComponent instantiating...');
    console.log('LoginComponent instantiation complete.');
  }

  ngOnInit(): void {

    console.log('Initializing form values for LoginComponent...');

    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });

    console.log('LoginComponent form value initialization complete.');

  }

  get formFields() {
    return this.loginForm.controls;
  }  

  login() {

    this.submitted = true;

    if (this.loginForm.invalid) return;

    this.loading = true;

    this.authService.authenticate(this.formFields.username.value, this.formFields.password.value);

  }

}
