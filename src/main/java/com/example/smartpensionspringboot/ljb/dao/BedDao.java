package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecBed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BedDao {

    void addBed(RecBed bed);

    RecBed getBedByOldId(@Param("oldId") long id);
}
