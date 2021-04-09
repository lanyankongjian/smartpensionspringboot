package com.example.smartpensionspringboot.fbm.dao;

import com.example.smartpensionspringboot.fbm.pojos.FbmFood;
import com.example.smartpensionspringboot.fbm.pojos.FbmFootCategory;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface FbmFootCategoryMapper {
    List<FbmFootCategory>findBy(ParamsVo paramsVo);
    void addFoot(FbmFootCategory fbmFootCategory);
    void updateFoot(FbmFootCategory fbmFootCategory);
    void deleteCategory(Integer id);
    List<FbmFood>find(Integer id);
}
