package com.componentesinjecaodependencia.services;

import com.componentesinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    public double total(Order order){

        ShippingService shippingService = new ShippingService();

        return ((order.getBasic() - ((order.getDiscount()) / 100) * order.getBasic()) + shippingService.shipment(order));
    }
}
