package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.OldAccidentTypeLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqactypeMapper {
    //查询所有
    List<OldAccidentTypeLQ> selectactype();

    //新增
    Integer inserttype(@Param("type") OldAccidentTypeLQ type);

    //修改
    Integer updatetype(@Param("type") OldAccidentTypeLQ type);

    //恢复
    Integer regaintype(@Param("atName") String atName);

    //根据类型id查询事故等级
    OldAccidentTypeLQ findlevel(@Param("atId") Integer atId);

    //根据类型名称来查询
    OldAccidentTypeLQ selectTypeByTname(@Param("atName") String atName, @Param("atLevel") String atLevel);

    //批量逻辑删除服务
    Integer logicDeletetypes(List<Integer> params);

    //批量逻辑恢复服务
    Integer logicregaintypes(List<Integer> params);

    //删除历史
    List<OldAccidentTypeLQ> history();

}
