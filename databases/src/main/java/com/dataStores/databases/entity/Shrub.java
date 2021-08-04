package com.dataStores.databases.entity;

import javax.persistence.Entity;

@Entity
public class Shrub extends Plant{
    private Double height;
    private Double width;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
