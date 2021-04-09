package com.example.smartpensionspringboot.fbm.service.impl;

import com.example.smartpensionspringboot.fbm.dao.FbmRecipeMapper;
import com.example.smartpensionspringboot.fbm.pojos.FbmRecipe;
import com.example.smartpensionspringboot.fbm.service.FbmRecipeService;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FbmRecipeServiceImpl implements FbmRecipeService{
    @Autowired
    private FbmRecipeMapper fbmRecipeMapper;
    //查询食谱
    @Override
    public PageInfo<FbmRecipe> querybRecipe(ParamsVo paramsVo) {
        return new PageInfo<>(fbmRecipeMapper.queryFbmRecipe(paramsVo));
    }
//    新增食谱
    @Transactional
    @Override
    public void addRecipe(FbmRecipe fbmRecipe) {
        fbmRecipeMapper.addRecipe(fbmRecipe);
    }
//    修改食谱
    @Transactional
    @Override
    public void updateRecipe(FbmRecipe fbmRecipe) {
        fbmRecipeMapper.updateRecipe(fbmRecipe);
    }
//    删除食谱
    @Transactional
    @Override
    public void deleteRecipe(Integer id) {
        fbmRecipeMapper.deleteRecipe(id);
    }
}
