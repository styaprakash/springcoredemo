package com.satya.springcoredemo.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Qualifier
//@Component
public class UpiPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Paying via UPI.");
    }
}
