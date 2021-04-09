package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.DetailStorage;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;

import java.math.BigDecimal;
import java.util.List;

public interface DetailStorageService {
    /**
     * 查看预存详情
     * @return
     */
    public List<DetailStorage> getDetailStorage();

    /**
     * 查看某个老人预存详情
     * @param id
     * @return
     */
    public List<DetailStorage> getDetailStorageByOldId(int id);

    /*
    预存充值
    */
    public int addDetailStorage(PrestoreVo vo);

    /**
     * 获取某个老人预存总余额
     */
    public BigDecimal getOldAmountById(PrestoreVo vo);
}
