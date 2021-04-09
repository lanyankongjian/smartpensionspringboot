package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.ArrearDao;
import com.example.smartpensionspringboot.lbb.pojos.Arrear;
import com.example.smartpensionspringboot.lbb.service.ArrearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArrearServiceImpl implements ArrearService {
    @Autowired
    private ArrearDao arrearDao;

    /**
     * 查看欠费信息
     * @return
     */
    @Override
    public List<Arrear> getAllArrear() {
        return arrearDao.getAllArrear();
    }
}
