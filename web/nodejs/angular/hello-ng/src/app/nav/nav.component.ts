import { Component, OnDestroy, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { Principal } from '../models/principal.model';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnDestroy {

  currentUser: Principal;
  currentUserSub: Subscription;

  constructor(private authService: AuthService, private router: Router) {
    this.currentUserSub = this.authService.currentUser$.subscribe(user => {
      this.currentUser = user;
    })
  }

  authenticatedUserLinks = [
    {
      linkName: 'Structural Directives Demo',
      fragment: '/structural'
    }, 
    {
      linkName: 'Attribute Directives Demo',
      fragment: '/attribute'
    }, 
    {
      linkName: 'Pipes Demo',
      fragment: '/pipes'
    }, 
    {
      linkName: 'Quiz (HttpClient Demo)',
      fragment: '/quiz'
    }, 
    {
      linkName: 'Dashboard',
      fragment: '/dashboard'
    }
  ]

  unauthenticatedUserLinks = [
    {
      linkName: 'Login',
      fragment: '/login'
    }
  ];

  ngOnDestroy() {
    // remember to unsubscribe from observables to  prevent memory leaks
    this.currentUserSub.unsubscribe(); 
  }

  logout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

}
