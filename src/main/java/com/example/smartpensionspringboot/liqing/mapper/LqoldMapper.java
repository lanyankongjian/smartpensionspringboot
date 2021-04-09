package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.RecOldLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqoldMapper {
    ///查询未返回的老人
    List<RecOldLQ> selectAllold();

    //查询所有老人
    List<RecOldLQ> findAllold();

}
