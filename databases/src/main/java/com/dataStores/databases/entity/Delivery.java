package com.dataStores.databases.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * the delivery class has a one to many relationship with the planr
 *
 */

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long deliveryId;
    private String recipientName;
    // specify the name of the address and its length
    @Column(name="full_Address", length = 500)
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private LocalDate deliveryTime;
    @Type(type = "yes_no")
    private Boolean completed;
    // show the relationship between the plant and the delivery class
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "delivery")
    private List<Plant> plants;

    // getters and setters

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}