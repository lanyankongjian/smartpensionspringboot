package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.pojos.RecOldHzj;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecOldMapper {
    //查询所有老人信息
    public List<RecOldHzj> selectRecOld();
    //根据老人名称模糊查询
    public List<RecOldHzj> selectOldName(String OldName);

    //修改状态
    public Integer updateStatus(int oldid);

}
