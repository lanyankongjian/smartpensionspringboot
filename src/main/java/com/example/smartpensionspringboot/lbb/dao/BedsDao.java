package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Bed;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BedsDao {
    /**
     * 根据老人编号查找到床位
     */
    public Bed getBedByOldId(int id);

    /**
     * 根据床位号查找到床位
     * @param bed
     * @return
     */
    public Bed getBedByBed(String bed);

    /**
     * 新增床位
     */
    public void addBed(Bed bed);
}
