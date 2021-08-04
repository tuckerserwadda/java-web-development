package com.dataStores.databases.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * the plant class is used as the parent class for both
 * the flowers and the shrub class.
 * the inheritance strategy chosen is the joined
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Plant {
    @Id
    @GeneratedValue
    private Long Id;
    // make the name cater for languages
    @Nationalized
    private String name;
    // specify the maximum number of digits on the price and the number of decimal places
    @Column(precision = 12, scale = 4)
    private BigDecimal price;
    @OneToMany
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

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
