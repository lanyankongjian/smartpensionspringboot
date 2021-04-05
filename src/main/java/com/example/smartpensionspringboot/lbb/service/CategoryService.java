package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Category;
import com.example.smartpensionspringboot.lbb.vo.CategoryVo;

import java.util.List;

public interface CategoryService {
    /**
     * 查看费用类别
     */
    public List<Category> getCategory();
    /**
     * 新增费用类别
     */
    public int addCategory(CategoryVo vo);
    /**
     * 修改费用类别
     */
    public int updateCategory(CategoryVo vo);
    /**
     * 根据类别编号查看类别
     */
    public Category getCategoryById(int id);

    /**
     * 搜索类别
     */
    public List<Category> getCategoryBySearch(CategoryVo vo);

    /**
     * 根据类别名称得到类别信息
     * @param name
     * @return
     */
    public Category getCategoryByName(String name);
}
