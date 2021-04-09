package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.DetailStorage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailStorageDao {
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

    /**
     * 预存充值
     * @param detailStorage
     * @return
     */
    public int addDetailStorage(DetailStorage detailStorage);

    /**
     * 获取某个老人预存总余额
    public BigDecimal getOldAmountById(int id);*/
}
