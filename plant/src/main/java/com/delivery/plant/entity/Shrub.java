package com.delivery.plant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Shrub {
    @Id
    @GeneratedValue
    private Long shrubId;

    private Double height;
    private Double width;

    public Long getShrubId() {
        return shrubId;
    }

    public void setShrubId(Long shrubId) {
        this.shrubId = shrubId;
    }

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
