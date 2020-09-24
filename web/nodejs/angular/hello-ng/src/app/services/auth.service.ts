import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
<<<<<<< HEAD
import { Principal } from '../models/principal.model';
import { map } from 'rxjs/operators';
import { environment as env } from '../../environments/environment'
=======
import { Principal } from '../models/principal';
import { map } from 'rxjs/operators';

import { environment as env } from '../../environments/environment';
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

@Injectable({
  providedIn: 'root'
})
export class AuthService {

<<<<<<< HEAD
  private currentUserSubject: BehaviorSubject<Principal>;
  currentUser$: Observable<Principal>;
=======
  private currentUserSubject: BehaviorSubject<Principal>
  currentUser$: Observable<Principal>
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

  constructor(private http: HttpClient) {
    console.log('Instantiating AuthService');
    this.currentUserSubject = new BehaviorSubject<Principal>(null);
    this.currentUser$ = this.currentUserSubject.asObservable();
<<<<<<< HEAD
    console.log("AuthService instantiation complete.");
    
=======
    console.log('AuthService instantiation complete.');
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  }

  get currentUserValue() {
    return this.currentUserSubject.value;
  }
<<<<<<< HEAD
  
  authenticate(username: string, password: string) {
    console.log(`Attempting to authenticate user with username!: ${username}`);
    let credentials = { username, password };
=======

  authenticate(username: string, password: string) {

    console.log('in authenticate()');
    let credentials = { username, password };

    console.log(`sending credentials, ${credentials}, to ${env.API_URL}/auth`);

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    return this.http.post(`${env.API_URL}/auth`, credentials, {
      headers: {
        'Content-type': 'application/json'
      },
      observe: 'response' // default is body (which refers to the body of the response)
    }).pipe(
<<<<<<< HEAD
      map(resp => {
        let principal = resp.body as Principal; // another for mof casting (using the 'as' keyword)
        console.log(principal);
        this.currentUserSubject.next(principal);
      })
    );
    
  }

  logout() {
    this.http.get(`${env.API_URL}/auth`); //invalidates the server http session
    this.currentUserSubject.next(null); // makes the UI aware that the user has signed out.
  }

  isAuthenticated(): boolean{
    return !!this.currentUserValue;
  }
=======

      map(resp => {
        let principal = resp.body as Principal; // another form of casting (using the 'as' keyword)
        this.currentUserSubject.next(principal);
      })
    );

  }

  logout(): void {
    this.http.get(`${env.API_URL}/auth`); // invalidate the server http session
    this.currentUserSubject.next(null); // makes the UI aware that the user has signed out
  }

  isAuthenticated(): boolean {
    return !!this.currentUserValue;
  }
  
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
}
