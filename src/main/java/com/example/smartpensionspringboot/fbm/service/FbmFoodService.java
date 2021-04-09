package com.example.smartpensionspringboot.fbm.service;

import com.example.smartpensionspringboot.fbm.pojos.FbmFood;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.github.pagehelper.PageInfo;

public interface FbmFoodService {
    PageInfo<FbmFood> querybFood(ParamsVo paramsVo);
    void addFood(FbmFood fbmFood);
    void updateFood(FbmFood fbmFood);
    void deleteFood(Integer id);

}
