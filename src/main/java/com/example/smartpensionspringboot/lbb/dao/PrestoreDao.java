package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface PrestoreDao {
    //查看预存信息
    public List<Prestore> getAllPrestore();

    //查看某个老人的预存详情
    public List<Prestore> getPrestoreByOldId(int id);

    /**
     * 新增预存
     */
    public int addPrestore(Prestore prestore);
}
