package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Payment;

import java.util.List;

public interface PaymentService {
    /**
     * 查看交费登记信息
     */
    public List<Payment> getPayment();
}
