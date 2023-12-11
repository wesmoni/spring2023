package com.example.spring2023.app;

import com.example.spring2023.domain.Orders;
import com.example.spring2023.domain.Users;

import java.util.ArrayList;
import java.util.List;

public class OrderHistoryManager {
    private List<Orders> orderList;

    public OrderHistoryManager() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Orders order) {
        orderList.add(order);
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public Orders getOrderById(int orderId) {
        for (Orders order : orderList) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public List<Orders> getOrdersByUser(Users user) {
        List<Orders> userOrders = new ArrayList<>();
        for (Orders order : orderList) {
            if (order.getUser().equals(user)) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }

    public void updateOrderStatus(int orderId, String newStatus) {
        for (Orders order : orderList) {
            if (order.getOrderId() == orderId) {
                order.setStatus(newStatus);
                break;
            }
        }
    }

    public void cancelOrder(int orderId) {
        for (Orders order : orderList) {
            if (order.getOrderId() == orderId) {
                order.setStatus("Cancelled");
                break;
            }
        }
    }
}
