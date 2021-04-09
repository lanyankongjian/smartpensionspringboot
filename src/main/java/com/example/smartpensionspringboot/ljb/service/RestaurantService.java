package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.RestaurantDao;
import com.example.smartpensionspringboot.ljb.pojos.RecRestaurant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService implements RestaurantDao {

    @Autowired
    private RestaurantDao restaurantDao;

    @Override
    public void addRes(RecRestaurant recRestaurant) {
        restaurantDao.addRes(recRestaurant);
    }

    @Override
    public RecRestaurant getResByOldId(long id) {
        return restaurantDao.getResByOldId(id);
    }
}
