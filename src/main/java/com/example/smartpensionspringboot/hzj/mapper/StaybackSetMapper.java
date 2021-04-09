package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.StaybackSet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaybackSetMapper {
    //新增退住结算
    public void insertStaybackSet(StaybackSet staybackSet);
    //查询所有已经结算
    public List<StaybackSet> selectStaybackSet();

    public List<StaybackSet> selectStaybackName(String setname);

    public Integer updetaStaybackSet(String oldName) ;
}
