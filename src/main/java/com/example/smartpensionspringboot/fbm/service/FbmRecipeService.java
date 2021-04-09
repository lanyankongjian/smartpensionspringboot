package com.example.smartpensionspringboot.fbm.service;

import com.example.smartpensionspringboot.fbm.pojos.FbmRecipe;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.github.pagehelper.PageInfo;

public interface FbmRecipeService {
    PageInfo<FbmRecipe> querybRecipe(ParamsVo paramsVo);
    void addRecipe(FbmRecipe fbmRecipe);
    void updateRecipe(FbmRecipe fbmRecipe);
    void deleteRecipe(Integer id);
}
