package com.example.smartpensionspringboot.fbm.dao;

import com.example.smartpensionspringboot.fbm.pojos.FbmRecipe;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FbmRecipeMapper {
    List<FbmRecipe> queryFbmRecipe(ParamsVo paramsVo);
    void addRecipe(FbmRecipe fbmRecipe);
    void updateRecipe(FbmRecipe fbmRecipe);
    void deleteRecipe(Integer id);
}
