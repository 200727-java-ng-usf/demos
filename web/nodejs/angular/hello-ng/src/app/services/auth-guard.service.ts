import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
<<<<<<< HEAD
export class AuthGuardService implements CanActivate{

  constructor(private authService: AuthService, private router: Router) {

   }
=======
export class AuthGuardService implements CanActivate {

  constructor(private authService: AuthService, private router: Router) {

  }
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
    
    if (!this.authService.isAuthenticated()) {
      console.log('You are not logged in and cannot view this page!');
      this.router.navigate(['/login']);
      return false;
    } else {
      return true;
    }
<<<<<<< HEAD
=======
    
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
  }
}
