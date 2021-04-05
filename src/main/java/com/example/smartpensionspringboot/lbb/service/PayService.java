package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Pay;
import com.example.smartpensionspringboot.lbb.vo.PayVo;

import java.util.List;

public interface PayService {
    /**
     * 入住交费
     */
    public void addPay(PayVo vo);

    /**
     * 查看入住交费信息
     */
    public List<Pay> getPay();
}
