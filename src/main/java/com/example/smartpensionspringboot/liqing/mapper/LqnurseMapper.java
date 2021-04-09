package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.NurseLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqnurseMapper {
    //查询所有护工
    List<NurseLQ> selectnurse();

    //根据护工id查询电话
    NurseLQ findphone(@Param("nuId") Integer nuId);
}
