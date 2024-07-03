package com.example.ldap_client.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductlistController {

    private ProductService productService;

    public ProductlistController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/productlist")
    public String getProdutlist(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "productlist";
    }

}