package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Stream;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StreamDao {
    /**
     * 查看费用流水
     */
    public List<Stream> getStream();

    /**
     * 新增费用流水
     */
    public int addStream(Stream stream);
}
