package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.DepositDao;
import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import com.example.smartpensionspringboot.lbb.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = false)
public class DepositServiceImpl implements DepositService {
    @Autowired
    private DepositDao depositDao;
    /**
     * 查看押金
     * @return
     */
    @Override
    public List<Deposit> getAllDeposit() {
        return depositDao.getAllDeposit();
    }
}
