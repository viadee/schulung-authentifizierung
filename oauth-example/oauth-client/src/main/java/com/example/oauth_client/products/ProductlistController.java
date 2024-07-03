package com.example.oauth_client.products;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClient;

@Controller
public class ProductlistController {

    @GetMapping("/productlist")
    public String getProdutlist(Model model) {
        model.addAttribute("products", getProducts());
        return "productlist";
    }

    @SuppressWarnings("unchecked")
    private List<Product> getProducts() {
        RestClient restClient = RestClient.create();
        return restClient.get().uri("http://localhost:8090/api/products")
                .accept(MediaType.APPLICATION_JSON).retrieve().body(List.class);
    }

}
