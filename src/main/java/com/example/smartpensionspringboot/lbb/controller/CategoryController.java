package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Category;
import com.example.smartpensionspringboot.lbb.service.CategoryService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getCategory")
    public Result getCategory(){
        List<Category> list = categoryService.getCategory();
        return Result.ok().data("categorys",list);
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
}
