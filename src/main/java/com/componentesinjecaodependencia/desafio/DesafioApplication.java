package com.componentesinjecaodependencia.desafio;

import com.componentesinjecaodependencia.entities.Order;
import com.componentesinjecaodependencia.services.OrderService;
import com.componentesinjecaodependencia.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.componentesinjecaodependencia"})
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {

        SpringApplication.run(DesafioApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double basic = sc.nextDouble();
        double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.printf("Pedido código %d%nValor total: R$ %.2f%n ", order.getCode(), orderService.total(order));

        sc.close();
    }
}
