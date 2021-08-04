package com.dataStores.databases.dto;

import java.math.BigDecimal;

/**
 * the DTo class helps to limit what we send to the clients
 * this we will send only the name of the plant and its price.
 * 
 */
public class PlantDTO {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
