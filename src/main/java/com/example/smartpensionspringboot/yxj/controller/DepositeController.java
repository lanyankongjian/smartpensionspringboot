package com.example.smartpensionspringboot.yxj.controller;

import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.yxj.pojos.Categorys;
import com.example.smartpensionspringboot.yxj.pojos.Deposite;
import com.example.smartpensionspringboot.yxj.pojos.Drug;
import com.example.smartpensionspringboot.yxj.service.DepositeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepositeController {
    @Autowired
    DepositeService depositeService;

    @RequestMapping("deposite-List")
    @ResponseBody
    public Map<String,Object> deposit(Integer pageNum, Integer size, @RequestParam("depositeMode") String a){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<Map<String,Object>> depos = depositeService.depositeList(a);
        map.put("rows",depos);
        map.put("total",page.getTotal());
        return map;
    }

    /**
     * 查询老人表
     * @return
     */
    @RequestMapping("/recold")
    @ResponseBody
    public List<RecOld> recOldList(){
        return depositeService.recOldList();
    }

    /**
     * 查询类别表
     * @return
     */
    @RequestMapping("/category-list")
    @ResponseBody
    public List<Categorys> categoryList(){
        return depositeService.categoryList();
    }


    /**
     * 查询药品和类别表
     * @param categoryId
     * @return
     */
    @RequestMapping("/drcList")
    @ResponseBody
    public List<Drug> drcList(@RequestParam("categoryId")  String categoryId){
        System.err.println(categoryId);
        return depositeService.drcList(categoryId);}

    /**
     * 修改状态
     * @param Id
     */
    @RequestMapping("/update")
    @ResponseBody
    public void updatedeposite(@RequestParam("Id") Integer Id){
        depositeService.updatedeposite(Id);
    }

    /**
     * 新增缴存
     * @param deposite
     */
    @PostMapping("/save-deposite")
    @ResponseBody
    public void savedeposite(@RequestBody Deposite deposite){
        System.out.println(deposite.toString());
        depositeService.savedeposite(deposite);
    }

}
