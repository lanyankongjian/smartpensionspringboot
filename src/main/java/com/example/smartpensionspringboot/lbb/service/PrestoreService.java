package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Prestore;

import java.math.BigDecimal;
import java.util.List;

public interface PrestoreService {
    /**
     * 查看预存信息
     * @return
     */
    public List<Prestore> getAllPrestore();

    /**
     * 查看某个老人的预存详情
     * @param id
     * @return
     */
    public List<Prestore> getPrestoreByOldId(int id);

    /**
     * 新增预存
     */
    public int addPrestore(Prestore prestore);
}
