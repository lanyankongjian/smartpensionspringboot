package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Deposit;

import java.util.List;

public interface DepositService {

    /**
     * 查看所有押金信息
     * @return
     */
    public List<Deposit> getAllDeposit();
}
