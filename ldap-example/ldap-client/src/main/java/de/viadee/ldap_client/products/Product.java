package de.viadee.ldap_client.products;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {

    private UUID id;

    private String name;

    private String description;

    private BigDecimal price;

    private String currency;

    public Product(UUID id, String name, String description, BigDecimal price, String currency) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
   
}
