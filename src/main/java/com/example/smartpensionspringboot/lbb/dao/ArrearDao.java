package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Arrear;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrearDao {
    /**
     * 查看欠费信息
     */
    public List<Arrear> getAllArrear();
}
