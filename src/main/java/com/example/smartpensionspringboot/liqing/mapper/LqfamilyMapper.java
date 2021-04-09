package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.RecFamilyLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecOldLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqfamilyMapper {

    //根据老人id来查询家属
    List<RecFamilyLQ> selectfamliy(@Param("oldId") Integer oldId);

    //根据家属id来查询信息
    RecFamilyLQ findfamily(@Param("familyId") Integer familyId);
}
