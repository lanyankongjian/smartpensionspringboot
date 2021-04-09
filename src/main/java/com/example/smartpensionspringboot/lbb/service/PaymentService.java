package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Payment;
import com.example.smartpensionspringboot.lbb.vo.PaymentVo;

import java.util.List;

public interface PaymentService {
    /**
     * 查看交费登记信息
     */
    public List<Payment> getPayment();

    /**
     * 交费登记
     */
    public void addPayment(Payment payment);

    /**
     * 搜索交费信息
     */
    public List<Payment> getPaymentBySearch(PaymentVo vo);
}
