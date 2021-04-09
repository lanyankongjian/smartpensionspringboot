package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecHealthInformations;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HealthInformationDao {

    public void addHealthInfo(RecHealthInformations healthInformation);

    public RecHealthInformations getHealthByOldId(@Param("oldId") long id);
}
