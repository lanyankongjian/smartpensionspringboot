package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Old;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OldDao {

    /**
     * 获取所有入住老人信息
     * @return
     */
    public List<Old> getAllOld();

    /**
     * 根据老人姓名得到老人信息
     */
    public Old getOldByName(String name);
}
