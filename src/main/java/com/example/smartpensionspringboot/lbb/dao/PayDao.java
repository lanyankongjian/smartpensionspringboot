package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Pay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayDao {
    /**
     * 入住交费
     */
    public void addPay(Pay pay);

    /**
     * 查看入住交费信息
     */
    public List<Pay> getPay();
}
