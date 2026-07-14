package com.satya.springcoredemo;

import com.satya.springcoredemo.payment.CardPaymentService;
import com.satya.springcoredemo.payment.PaymentService;
import com.satya.springcoredemo.payment.UpiPaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//this is a configuration class

@Configuration // marks a class as a source of bean definitions.
@ComponentScan("com.satya.springcoredemo")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Satya", 25);
    }

    @Bean
    @Qualifier("cp")
    public PaymentService createCardPayment(){
        return new CardPaymentService();
    }

    @Bean
//    @Primary
    @Qualifier("upi")
    public PaymentService createUpiPayment(){
        return new UpiPaymentService();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("cp") PaymentService paymentService){
        return new OrderService(paymentService);

    }
}
