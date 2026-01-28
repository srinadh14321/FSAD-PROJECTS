package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class ProductOrder {

    private int orderId;
    private String customerName;
    private String productName;
    private int quantity;

   
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Following is the order details:");
        System.out.println("OrderId: " + orderId);
        System.out.println("CustomerName: " + customerName);
        System.out.println("ProductName: " + productName);
        System.out.println("Quantity: " + quantity);
    }
}
