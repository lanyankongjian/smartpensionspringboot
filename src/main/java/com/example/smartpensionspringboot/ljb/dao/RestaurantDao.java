package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecRestaurant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RestaurantDao {

    void addRes(RecRestaurant recRestaurant);

    RecRestaurant getResByOldId(@Param("oldId") long id);
}
