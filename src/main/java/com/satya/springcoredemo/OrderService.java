package com.satya.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // private PaymentService paymentService;

    // // Constructor injection
    // public OrderService(PaymentService paymentService) {
    // this.paymentService = paymentService;
    // }

    public void placeOrder() {
        // paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
