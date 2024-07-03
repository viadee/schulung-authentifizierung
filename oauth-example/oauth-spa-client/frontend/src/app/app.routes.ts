import { Routes } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';
import { ProductListComponent } from './product-list/product-list.component';

export const routes: Routes = [
    { path: '', component: HomeComponent},
    { path: 'productlist', component: ProductListComponent},
    { path: '**', component: PageNotFoundComponent }
];
