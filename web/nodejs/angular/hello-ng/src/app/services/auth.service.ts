import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() {
    console.log('Instantiating AuthService');
    console.log('AuthService instantiation complete.');
  }

  authenticate(username: string, password: string): void {
    console.log(`Attempting to authenticate user with username: ${username}`);
  }

  logout() {

  }
  
}
