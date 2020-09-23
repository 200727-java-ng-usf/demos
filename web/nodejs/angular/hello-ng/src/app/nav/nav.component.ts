import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent {

  navLinks = [
    {
      linkName: 'Login',
      fragment: '/login'
    }, 
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
    },
    {
      linkName: 'First',
      fragment: '/'
    }
  ];

}