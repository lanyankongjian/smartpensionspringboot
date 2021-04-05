package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Other;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OtherDao {
    /**
     * 消费登记
     */
    public void addOther(Other other);
}
