package com.satya.springcoredemo.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary

//@Qualifier("cp")
@Component
public class CardPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Paying Via Card.");
    }
}
