package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.PaymentDao;
import com.example.smartpensionspringboot.lbb.pojos.Payment;
import com.example.smartpensionspringboot.lbb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = false)
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public List<Payment> getPayment() {
        return paymentDao.getPayment();
    }
}
