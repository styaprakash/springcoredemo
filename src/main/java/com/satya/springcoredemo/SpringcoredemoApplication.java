package com.satya.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringcoredemoApplication.class, args);

		// PaymentService paymentService = new PaymentService();
		// OrderService order = new OrderService(paymentService);
		// order.placeOrder();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // pass ap config
																								// reflection

		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

//		PaymentService paymentService = context.getBean(PaymentService.class);
//		paymentService.pay();
	}

}
