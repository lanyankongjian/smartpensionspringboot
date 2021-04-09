package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.CostStream;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CostStreamMapper {
    //根据id查询老人费用
    public List<CostStream> selectCostStream(int oldid);
}
