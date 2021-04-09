package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.RecTotalCost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecTotalCostMapper {

    public List<RecTotalCost> selectRecTotalCost(int oldid);
}
