package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecFamily;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FamilyDao {

//      根据老人id获取家人信息
    public List<RecFamily> getFamilyByOldId(@Param("oldId") long oldId);

//    添加家属信息
    public void addFamily(RecFamily family);
}
