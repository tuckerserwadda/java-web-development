package com.dataStores.databases.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * the flower class extends the plant class
 * it shares information with the shrub class
 */

@Entity
public class Flower extends Plant {

        private String flowerColor;

        // setter and getters

        public String getFlowerColor() {
                return flowerColor;
        }

        public void setFlowerColor(String flowerColor) {
                this.flowerColor = flowerColor;
        }


}
