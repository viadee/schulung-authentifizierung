package com.example.oauth_client.products;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Controller
public class ProductlistController {

    private WebClient webClient;

    public ProductlistController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/productlist")
    public String getProdutlist(Model model) {
        model.addAttribute("products", getProducts());
        return "productlist";
    }

    private List<Product> getProducts() {
        Mono<Product[]> response = webClient.get().uri("http://localhost:8081/api/products")
                .retrieve().bodyToMono(Product[].class);
        Product[] products = response.block();
        return Arrays.asList(products);
    }

}
