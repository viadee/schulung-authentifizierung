import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
//import { BrowserModule } from '@angular/platform-browser';
import { RouterOutlet } from '@angular/router';
//import { OidcSecurityService } from 'angular-auth-oidc-client';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'OAuth 2.0 Example WebShop SPA';

  //isAuthenticated=false;
  //
  //constructor(private oidcSecurityService: OidcSecurityService) {}
  //
  //ngOnInit() {
  //  this.oidcSecurityService.checkAuth().subscribe(({ isAuthenticated, userData}) => {
  //    this.isAuthenticated = isAuthenticated;
  //  });
  //}
  //
  //logout() {
  //  this.oidcSecurityService.logoff().subscribe((result) => console.log(result));
  //}

}
