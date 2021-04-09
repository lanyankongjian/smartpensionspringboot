package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.Category;
import com.example.smartpensionspringboot.lbb.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDao {
    /**
     * 查看费用类别
     */
    public List<Category> getCategory();

    /**
     * 根据类别编号查看类别
     */
    public Category getCategoryById(int id);

    /**
     * 新增费用类别
     */
    public int addCategory(Category category);

    /**
     * 修改费用类别
     */
    public int updateCategory(Category category);

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
