package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.vo.AskAndOld;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AskAndOldaskDao {
    /**
     * 获取咨询老人和咨询者
     * @return
     */
    List<AskAndOld> getAskAndOld();

    /**
     * 模糊查询
     * @param askAndOld
     * @return
     */
    List<AskAndOld> conditionalQuery(AskAndOld askAndOld);
}
