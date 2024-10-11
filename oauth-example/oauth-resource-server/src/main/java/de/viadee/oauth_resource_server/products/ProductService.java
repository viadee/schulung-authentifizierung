package de.viadee.oauth_resource_server.products;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        initProducts();
    }

    private void initProducts() {
        products.add(new Product(UUID.fromString("f15db09a-16f6-425e-a7f3-fe17272fed48"), "Milch",
                "Frische Milch mit 3,5% Fett im praktischen 1l Tetra-Pack.", new BigDecimal("1.99"), "€"));
        products.add(new Product(UUID.fromString("6e92b186-b671-4e6a-b13d-b35788c89b97"), "Kaffee",
                "500g gemahlener Hochlandkaffe aus Bolivien.", new BigDecimal("5.99"), "€"));
        products.add(new Product(UUID.fromString("32b3a84a-e01a-4965-9506-53b075dfaac6"), "Spaghetti",
                "500g original italienische Spaghetti.", new BigDecimal("2.99"), "€"));
        products.add(new Product(UUID.fromString("26b61f40-5637-43d8-b84c-012bd84a823b"), "O-Saft",
                "1l Orangensaft aus Konzentrat", new BigDecimal("0.79"), "€"));
        products.add(new Product(UUID.fromString("6f8e577f-9f4c-4f18-a63b-255e70af2905"), "Mehl",
                "1kg Weizenmehl Typ 405.", new BigDecimal("0.99"), "€"));
        products.add(new Product(UUID.fromString("8e2df511-c869-4590-aa0a-ce4476d10df3"), "Salz",
                "500g Jodsalz mit Fluorid aus reiner Aplensole.", new BigDecimal("1.29"), "€"));
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getProduct(UUID uuid) {
        return getProductByUUID(uuid);
    }

    public Product createProduct(String name, String description, BigDecimal price, String currency) {
        Product product = new Product(UUID.randomUUID(), name, description, price, currency);
        products.add(product);
        return product;
    }

    public Product updateProduct(UUID uuid, Product product) {
        Product productToUpdate = getProductByUUID(uuid);
        productToUpdate.setName(product.getName());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setPrice(product.getPrice());
        return productToUpdate;
    }

    public boolean deleteProdukt(UUID uuid) {
        boolean deleted = false;
        Product product = getProductByUUID(uuid);
        if (product != null) {
            deleted = products.remove(product);
        }
        return deleted;
    }

    private Product getProductByUUID(UUID uuid) {
        Product result = null;
        for (Product product : products) {
            if (product.getId().equals(uuid)) {
                result = product;
            }
        }
        return result;
    }

}
