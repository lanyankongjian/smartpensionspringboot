package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Category;
import com.example.smartpensionspringboot.lbb.service.CategoryService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.CategoryVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查看所有类别
     */
    @GetMapping("/getCategory/{current}/{limit}")
    public Result getCategory(@PathVariable int current,@PathVariable int limit){
        Page<Category> page = PageHelper.startPage(current, limit);
        List<Category> list = categoryService.getCategory();
        long total = page.getTotal();
        return Result.ok().data("categorys",list).data("total",total);
    }

    /**
     * 新增类别
     */
    @PostMapping("/addCategory")
    public Result addCategory(@RequestBody CategoryVo vo){
        categoryService.addCategory(vo);
        return Result.ok();
    }

    /**
     * 修改类别
     */
    @PostMapping("/updateCategory")
    public Result updateCategory(@RequestBody CategoryVo vo){
        categoryService.updateCategory(vo);
        return Result.ok();
    }

    /**
     * 根据类别编号查看类别
     */
    @GetMapping("/getCateById/{id}")
    public Result getCateById(@PathVariable int id){
        Category category = categoryService.getCategoryById(id);
        return Result.ok().data("category",category);
    }

    /**
     * 搜索类别
     */
    @PostMapping("/getCategoryBySearch/{current}/{limit}")
    public Result getCategoryBySearch(@PathVariable int current,
                                      @PathVariable int limit,
                                      @RequestBody(required = false) CategoryVo vo){
        Page<Category> page = PageHelper.startPage(current,limit);
        List<Category> list = categoryService.getCategoryBySearch(vo);
        long total = page.getTotal();
        return Result.ok().data("categorys",list).data("total",total);
    }
    @PostMapping("/getAmountByName")
    public Result getAmountByName(@RequestBody(required = false) CategoryVo vo){
        Category category = categoryService.getCategoryByName(vo.getCategory_name());
        BigDecimal amount = category.getFees();
        return Result.ok().data("amount",amount);
    }

}
