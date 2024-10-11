import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';
import { OidcSecurityService } from 'angular-auth-oidc-client';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private url = 'http://localhost:8090/api/products';

  constructor(private http: HttpClient, private oidcSecurityServices: OidcSecurityService) {}

  getProducts(): Observable<Product[]> {
    var authToken;
    this.oidcSecurityServices.getAccessToken().subscribe((token) => {
       authToken = token;
    });

    return this.http.get<Product[]>(this.url, {headers: {Accept: 'application/json', Authorization: 'Bearer ' + authToken}});
  }

}
