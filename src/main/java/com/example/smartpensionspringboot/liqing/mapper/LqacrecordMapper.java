package com.example.smartpensionspringboot.liqing.mapper;

import com.example.smartpensionspringboot.liqing.pojos.OldAccidentRecordLQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LqacrecordMapper {

    //查询所有
    List<OldAccidentRecordLQ> selectAllrecord();

    //新增
    Integer insertrecord(@Param("r") OldAccidentRecordLQ r);

    //修改
    Integer updaterecord(@Param("r") OldAccidentRecordLQ r);

    //高级查询
    List<OldAccidentRecordLQ> adQueryrecord(@Param("oldName") String oldName,
                                            @Param("bed") String bed, @Param("nuName") String nuName);

    //批量逻辑删除服务
    Integer logicDeleterecirds(List<Integer> params);

    //历史删除
    List<OldAccidentRecordLQ> history();
}
