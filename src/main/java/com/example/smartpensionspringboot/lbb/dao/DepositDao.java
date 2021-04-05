package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepositDao {
    /**
     * 查看所有押金
     * @return
     */
    public List<Deposit> getAllDeposit();
}
