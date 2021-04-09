package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.DepositDao;
import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import com.example.smartpensionspringboot.lbb.service.DepositService;
import com.example.smartpensionspringboot.lbb.vo.DepositVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepositServiceImpl implements DepositService {
    @Autowired
    private DepositDao depositDao;
    /**
     * 查看押金
     * @return
     */
    @Override
    public List<Deposit> getAllDeposit() {
        return depositDao.getAllDeposit();
    }

    /**
     * 根据押金编号查看押金
     * @param id
     * @return
     */
    @Override
    public Deposit getDepositById(int id) {
        return depositDao.getDepositById(id);
    }

    /**
     * 搜索押金
     * @param vo
     * @return
     */
    @Override
    public List<Deposit> getDepositBySearch(DepositVo vo) {
        return depositDao.getDepositBySearch(vo);
    }
}
