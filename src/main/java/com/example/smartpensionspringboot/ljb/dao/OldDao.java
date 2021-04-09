package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.ljb.pojos.RecOld2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OldDao {

    /**
     * 获取所有入住老人信息
     * @return
     */
    public List<RecOld> getAllOld();

    /**
     * 模糊查询
     * @param recOld
     * @return
     */
    public List<RecOld> fazzySearchByOld(RecOld recOld);

    /**
     * 添加老人信息
     * @param recOld
     */
    public long addOld(RecOld recOld);

    RecOld getOldByOldId(@Param("oldId") long id);
}
