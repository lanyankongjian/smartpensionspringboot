package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Old;

import java.util.List;

public interface OldService {
    /**
     * 获取所有入住老人信息
     * @return
     */
    public List<Old> getAllOld();

    /**
     * 根据老人姓名得到老人信息
     */
    public Old getOldByName(String name);
}
