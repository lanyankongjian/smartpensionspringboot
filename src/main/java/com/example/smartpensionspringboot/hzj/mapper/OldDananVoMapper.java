package com.example.smartpensionspringboot.hzj.mapper;

import com.example.smartpensionspringboot.hzj.vo.OldDananVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OldDananVoMapper {
    public OldDananVo selectOldDananVO(Integer oldid);
}
