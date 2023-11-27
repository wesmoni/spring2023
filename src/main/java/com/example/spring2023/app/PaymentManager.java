package com.example.spring2023.app;

import com.example.spring2023.domain.Payment;
import org.hibernate.mapping.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PaymentManager {
    private Map<String, List<Payment>> paymentsByType;

    public PaymentManager() {
        this.paymentsByType = new HashMap<>();
    }

    public void addPayment(Payment payment) {
        String paymentType = payment.getType();
        if (this.paymentsByType.containsKey(paymentType)) {
            this.paymentsByType.get(paymentType).add(payment);
        } else {
            List<Payment> payments = new ArrayList<>();
            payments.add(payment);
            this.paymentsByType.put(paymentType, payments);
        }
    }

    public void removePayment(Payment payment) {
        String paymentType = payment.getType();
        if (this.paymentsByType.containsKey(paymentType)) {
            this.paymentsByType.get(paymentType).remove(payment);
        }
    }

    public List<Payment> getAllPaymentsByType(String paymentType) {
        return this.paymentsByType.getOrDefault(paymentType, new ArrayList<>());
    }

    public double getTotalAmountByType(String paymentType) {
        double totalAmount = 0;
        if (this.paymentsByType.containsKey(paymentType)) {
            for (Payment payment : this.paymentsByType.get(paymentType)) {
                totalAmount += payment.getAmount();
            }
        }
        return totalAmount;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (List<Payment> payments : this.paymentsByType.values()) {
            for (Payment payment : payments) {
                totalAmount += payment.getAmount();
            }
        }
        return totalAmount;
    }
}
