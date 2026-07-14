package com.satya.springcoredemo;

import com.satya.springcoredemo.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
//    @Autowired
     private  PaymentService paymentService;

    // // Constructor injection

//    @Autowired
     public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
     }


    //setter method
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    //so now basically in Setter method, we wired the dependency of PaymentService with OrderService
    // after the creation of objects first
    public void placeOrder() {
         paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
