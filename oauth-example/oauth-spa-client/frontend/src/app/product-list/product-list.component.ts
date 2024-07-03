import { Component } from '@angular/core';
import { MatTableModule } from '@angular/material/table';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [MatTableModule],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent {
  displayedColumns: string[] = ['name', 'description', 'price'];
  productList: Product[] = [];

  constructor(private productService: ProductService) {}

  ngOnInit() {
    this.productService.getProducts().subscribe({
      next: (products) => this.productList = products,
      error: (e) => console.error(e)
    })
  }

}
