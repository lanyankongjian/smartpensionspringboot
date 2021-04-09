package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.PaymentDao;
import com.example.smartpensionspringboot.lbb.pojos.Payment;
import com.example.smartpensionspringboot.lbb.service.PaymentService;
import com.example.smartpensionspringboot.lbb.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public List<Payment> getPayment() {
        return paymentDao.getPayment();
    }

    /**
     * 交费登记
     * @param payment
     */
    @Transactional
    @Override
    public void addPayment(Payment payment) {
        paymentDao.addPayment(payment);
    }

    /**
     * 搜索交费
     * @param vo
     * @return
     */
    @Override
    public List<Payment> getPaymentBySearch(PaymentVo vo) {
        return paymentDao.getPaymentBySearch(vo);
    }
}
