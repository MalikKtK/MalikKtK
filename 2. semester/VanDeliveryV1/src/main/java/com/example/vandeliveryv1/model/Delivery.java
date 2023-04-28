package com.example.vandeliveryv1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deliveryId")
    private int deliveryId;
    private LocalDate deliveryDate;
    private String fromWarehouse;
    private String destination;

    @OneToMany(mappedBy = "delivery")
    @JsonBackReference
    private final Set<ProductOrder> productOrders = new HashSet<>();

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getFromWarehouse() {
        return fromWarehouse;
    }

    public void setFromWarehouse(String fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Set<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public Delivery(int deliveryId, LocalDate deliveryDate, String fromWarehouse, String destination) {
        this.deliveryId = deliveryId;
        this.deliveryDate = deliveryDate;
        this.fromWarehouse = fromWarehouse;
        this.destination = destination;
    }

    public Delivery() {
    }
}
