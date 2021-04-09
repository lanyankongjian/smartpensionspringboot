package com.example.smartpensionspringboot.fbm.dao;

import com.example.smartpensionspringboot.fbm.pojos.FbmFood;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface FbmFoodMapper {
    List<FbmFood>queryFbmFood(ParamsVo paramsVo);
    void addFood(FbmFood fbmFood);
    void updateFood(FbmFood fbmFood);
    void deleteFood(Integer id);
}
