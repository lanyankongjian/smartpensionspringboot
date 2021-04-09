package com.example.smartpensionspringboot.fbm.service.impl;

import com.example.smartpensionspringboot.fbm.dao.FbmFoodMapper;
import com.example.smartpensionspringboot.fbm.pojos.FbmFood;
import com.example.smartpensionspringboot.fbm.service.FbmFoodService;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FbmFoodServiceImpl implements FbmFoodService {
    @Autowired
    private FbmFoodMapper fbmFoodMapper;
    //查询食品
    @Override
    public PageInfo<FbmFood> querybFood(ParamsVo paramsVo) {
        return new PageInfo<>(fbmFoodMapper.queryFbmFood(paramsVo));
    }
    //新增食品
    @Transactional
    @Override
    public void addFood(FbmFood fbmFood) {
        fbmFoodMapper.addFood(fbmFood);
    }
    //修改食品
    @Transactional
    @Override
    public void updateFood(FbmFood fbmFood) {
        fbmFoodMapper.updateFood(fbmFood);
    }
    //删除食物
    @Transactional
    @Override
    public void deleteFood(Integer id) {
        fbmFoodMapper.deleteFood(id);
    }
}
