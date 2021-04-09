package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.OldOutRegisterLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqregisterMapper {
    //查询所有
    List<OldOutRegisterLQ> selectregister();

    //删除
    Integer deleteregister(@Param("orId") Long orId);

    //高级查询
    List<OldOutRegisterLQ> adQueryrigister(@Param("oldName") String oldName, @Param("orBack") Integer orBack,
                                           @Param("sartDate") String sartDate, @Param("endDate") String endDate);
    //新增
    Integer insertrigister(@Param("r") OldOutRegisterLQ r);

    //修改
    Integer updaterigister(@Param("r") OldOutRegisterLQ r);

    //批量逻辑删除
    Integer logicDeleteregisters(List<Integer> params);

    //删除历史
    List<OldOutRegisterLQ> history();

    //查询超过时间的老人
    List<OldOutRegisterLQ> overtimes();


}
