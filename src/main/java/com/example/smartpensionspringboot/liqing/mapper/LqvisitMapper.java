package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.OldVisitLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqvisitMapper {
    //查询所有
    List<OldVisitLQ> selectAllvisit();

    //新增
    Integer insertvisit(@Param("v") OldVisitLQ v);

    //修改
    Integer updatevisit(@Param("v") OldVisitLQ v);

    //高级查询
    List<OldVisitLQ> adQueryvisit(@Param("vCname") String vCname, @Param("oldName") String oldName,
                                  @Param("sartDate") String sartDate, @Param("endDate") String endDate);

    //批量逻辑删除服务
    Integer logicDeleteVisits(List<Integer> params);

    //删除历史
    List<OldVisitLQ> history();
}
