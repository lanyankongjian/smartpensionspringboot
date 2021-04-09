package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.StaybackDengji;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaybackDengjiMapper {
    public void insertStaybackDengji(StaybackDengji staybackDengji);

    public List<StaybackDengji> selectDengji();

    public List<StaybackDengji> selectDengjiName(String oldname);
}
