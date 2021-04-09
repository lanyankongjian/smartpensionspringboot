package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import com.example.smartpensionspringboot.lbb.vo.DepositVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepositDao {
    /**
     * 查看所有押金
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
