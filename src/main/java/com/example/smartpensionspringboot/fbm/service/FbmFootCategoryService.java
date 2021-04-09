package com.example.smartpensionspringboot.fbm.service;

import com.example.smartpensionspringboot.fbm.pojos.FbmFootCategory;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.github.pagehelper.PageInfo;


public interface FbmFootCategoryService {
    /**
     * 模糊查询食物类别
     * @param paramsVo
     * @return
     */
    PageInfo<FbmFootCategory> findEmpAll(ParamsVo paramsVo);

    /**
     * 添加食物类别
     * @param fbmFootCategory
     */
    void addFootCategory(FbmFootCategory fbmFootCategory);
    void updateFoot(FbmFootCategory fbmFootCategory);
    String deleteCategory(Integer id);
}
