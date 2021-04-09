package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import com.example.smartpensionspringboot.lbb.vo.DepositVo;

import java.util.List;

public interface DepositService {

    /**
     * 查看所有押金信息
     * @return
     */
    public List<Deposit> getAllDeposit();

    /**
     * 根据押金编号查看押金
     * @param id
     * @return
     */
    public Deposit getDepositById(int id);

    /**
     * 搜素押金
     * @param vo
     * @return
     */
    public List<Deposit> getDepositBySearch(DepositVo vo);
}
