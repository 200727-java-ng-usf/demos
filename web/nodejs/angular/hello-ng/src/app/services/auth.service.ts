import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Principal } from '../models/principal.model';
import { map } from 'rxjs/operators';
import { environment as env } from '../../environments/environment'

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private currentUserSubject: BehaviorSubject<Principal>;
  currentUser$: Observable<Principal>;

  constructor(private http: HttpClient) {
    console.log('Instantiating AuthService');
    this.currentUserSubject = new BehaviorSubject<Principal>(null);
    this.currentUser$ = this.currentUserSubject.asObservable();
    console.log("AuthService instantiation complete.");
    
  }

  get currentUserValue() {
    return this.currentUserSubject.value;
  }
  
  authenticate(username: string, password: string) {
    console.log(`Attempting to authenticate user with username!: ${username}`);
    let credentials = { username, password };
    console.log(`sending credentials, ${credentials}, to ${env.API_URL}/auth`);
    return this.http.post(`${env.API_URL}/auth`, credentials, {
      headers: {
        'Content-type': 'application/json'
      },
      observe: 'response' // default is body (which refers to the body of the response)
    }).pipe(
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
}
