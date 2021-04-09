package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Arrear;

import java.util.List;

public interface ArrearService {
    /**
     * 查看欠费信息
     */
    public List<Arrear> getAllArrear();
}
