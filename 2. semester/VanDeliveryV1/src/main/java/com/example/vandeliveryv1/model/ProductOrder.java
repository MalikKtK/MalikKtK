package com.example.vandeliveryv1.model;

import jakarta.persistence.*;

@Entity
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productOrderId;
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "proid", referencedColumnName = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "delvId", referencedColumnName = "deliveryId")
    private Delivery delivery;

    public ProductOrder() {
    }

    public ProductOrder(int productOrderId, double quantity, Product product, Delivery delivery) {
        this.productOrderId = productOrderId;
        this.quantity = quantity;
        this.product = product;
        this.delivery = delivery;
    }

    public int getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(int productOrderId) {
        this.productOrderId = productOrderId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
