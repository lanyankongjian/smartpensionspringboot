package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.ExpectedRegistrations;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExpectedRegMapper {

    public List<ExpectedRegistrations> selectExpctedReg(int oldid);
}
