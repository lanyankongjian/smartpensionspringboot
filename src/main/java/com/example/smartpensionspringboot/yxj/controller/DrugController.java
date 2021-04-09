package com.example.smartpensionspringboot.yxj.controller;


import com.example.smartpensionspringboot.yxj.pojos.Categorys;
import com.example.smartpensionspringboot.yxj.pojos.Drug;
import com.example.smartpensionspringboot.yxj.service.DrugService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

import java.util.List;
import java.util.Map;

@RestController
public class DrugController {
    @Autowired
    DrugService drugService;

    /**
     * 分页查询两表
     * @param pageNum
     * @param size
     * @param a
     * @param b
     * @return
     */
    @GetMapping("/drug-list")
    public Map<String,Object> drug(Integer pageNum,Integer size,@RequestParam("drugCode") String a,@RequestParam("drugName") String b){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<Drug> drugs = drugService.drugList(a,b);
        map.put("rows",drugs);
        map.put("total",page.getTotal());
        return map;
    }

    /**
     * 查询药品类别表
     * @return
     */
    @RequestMapping("/category")
    public List<Categorys> categoryList(){
        return drugService.categoryList();
    }


    /**
     * 新增药品信息
     * @param d
     */
    @PostMapping("/saveDrug")
    @ResponseBody
    public void saveDrug(@RequestBody Drug d){
        drugService.saveDrug(d);
    }

    /**
     * 删除药品信息
     * @param d
     */
    @PostMapping("/deleteDrug")
    @ResponseBody
    public void deleteDrug(@RequestBody List<Drug> d){
        d.forEach(a->{
            drugService.deleteDrug(a.getDrugId());
        });
    }


}
