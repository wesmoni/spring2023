package com.example.spring2023.app;

import com.example.spring2023.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Конструктор класса
 * */
@Service
public class OrderProcessingManager {

//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private PaymentService paymentService;
//
//    @Autowired
//    private ShippingService shippingService;


    //разобраться со статусом в ордерс
//    public void processOrder(Orders order) {
//        if (paymentService.processPayment(order)) {
//            order.setStatus("PAID");
//            orderRepository.save(order);
//            shippingService.shipOrder(order);
//        } else {
//            order.setStatus("PAYMENT_FAILED");
//            orderRepository.save(order);
//        }
//    }

//    public void cancelOrder(Orders order) {
//        if (order.getStatus().equals("PAID")) {
//            paymentService.refundPayment(order);
//        }
//        order.setStatus("CANCELLED");
//        orderRepository.save(order);
//    }
}
