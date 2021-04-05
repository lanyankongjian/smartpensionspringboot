package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.CategoryDao;
import com.example.smartpensionspringboot.lbb.exeception.GuliException;
import com.example.smartpensionspringboot.lbb.pojos.Category;
import com.example.smartpensionspringboot.lbb.service.CategoryService;
import com.example.smartpensionspringboot.lbb.util.BeanCopyUtil;
import com.example.smartpensionspringboot.lbb.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getCategory() {
        return categoryDao.getCategory();
    }

    /**
     * 新增类别
     * @param vo
     * @return
     */
    @Transactional
    @Override
    public int addCategory(CategoryVo vo) {
        Category category = new Category();
        BeanCopyUtil.copyProperties(vo,category);
        int i = categoryDao.addCategory(category);
        if (i > 0){
            return i;
        }else {
            throw new GuliException(201,"添加类别失败");
        }
    }

    /**
     * 修改类别信息
     * @param vo
     * @return
     */
    @Transactional
    @Override
    public int updateCategory(CategoryVo vo) {
        Category category = categoryDao.getCategoryById(vo.getId());
        BeanCopyUtil.copyProperties(vo,category);
        int i = categoryDao.updateCategory(category);
        if (i > 0){
            return i;
        }else {
            throw new GuliException(201,"修改类别失败");
        }
    }

    /**
     * 根据类别编号得到类别
     * @param id
     * @return
     */
    @Override
    public Category getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }

    /**
     * 搜索类别
     * @param vo
     * @return
     */
    @Override
    public List<Category> getCategoryBySearch(CategoryVo vo) {
        Category category = new Category();
        BeanCopyUtil.copyProperties(vo,category);
        return categoryDao.getCategoryBySearch(category);
    }


    /**
     * 根据类别名称得到类别
     * @param name
     * @return
     */
    @Override
    public Category getCategoryByName(String name) {
        return categoryDao.getCategoryByName(name);
    }
}
