package com.example.smartpensionspringboot.fbm.service.impl;

import com.example.smartpensionspringboot.fbm.dao.FbmFootCategoryMapper;
import com.example.smartpensionspringboot.fbm.pojos.FbmFood;
import com.example.smartpensionspringboot.fbm.pojos.FbmFootCategory;
import com.example.smartpensionspringboot.fbm.service.FbmFootCategoryService;
import com.example.smartpensionspringboot.fbm.vo.ParamsVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class FbmFootCategoryServiceImpl implements FbmFootCategoryService {
    @Autowired
    private FbmFootCategoryMapper fbmFootCategoryMapper;
//    查询食物类别
    @Override
    public PageInfo<FbmFootCategory> findEmpAll(ParamsVo paramsVo) {
        return new PageInfo<>(fbmFootCategoryMapper.findBy(paramsVo));
    }
    //新增食物类别
    @Transactional
    @Override
    public void addFootCategory(FbmFootCategory fbmFootCategory) {
        fbmFootCategoryMapper.addFoot(fbmFootCategory);
    }
//    修改食物类别
    @Transactional
    @Override
    public void updateFoot(FbmFootCategory fbmFootCategory) {
        fbmFootCategoryMapper.updateFoot(fbmFootCategory);
    }
    //删除食物类别
    @Transactional
    @Override
    public String  deleteCategory(Integer id) {
        List<FbmFood> fbmFoods = fbmFootCategoryMapper.find(id);
        if (fbmFoods.size()==0){
            fbmFootCategoryMapper.deleteCategory(id);
            return "删除成功！";
        }else{
            return "删除失败！请先删除类别下食物";
        }


    }


}
