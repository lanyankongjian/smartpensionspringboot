package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.RecFamilys;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecFamilyMapper {
    //根据老人id查询到所有的家属信息
    public List<RecFamilys> selectFamily(int oldid);
}
