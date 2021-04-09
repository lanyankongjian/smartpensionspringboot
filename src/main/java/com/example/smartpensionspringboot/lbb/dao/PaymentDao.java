package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Payment;
import com.example.smartpensionspringboot.lbb.vo.PaymentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentDao {
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
