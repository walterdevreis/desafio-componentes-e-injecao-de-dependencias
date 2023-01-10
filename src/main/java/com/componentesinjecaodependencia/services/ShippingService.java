package com.componentesinjecaodependencia.services;

import com.componentesinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double valorTotal;

        if(order.getBasic() < 100.00){
            valorTotal = 20.00;
        }
        else if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00){
            valorTotal = 12.00;
        }
        else {
            valorTotal = 0.00;
        }

        return valorTotal;
    }
}
