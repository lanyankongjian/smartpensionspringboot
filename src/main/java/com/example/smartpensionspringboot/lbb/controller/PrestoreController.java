package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.service.PrestoreService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class PrestoreController {
    @Autowired
    private PrestoreService prestoreService;


    @PostMapping("/getPrestoresBySearch/{current}/{limit}")
    public Result getPrestoresBySearch(@PathVariable int current,
                                       @PathVariable int limit,
                                       @RequestBody(required = false) PrestoreVo vo){
        Page<Prestore> page = PageHelper.startPage(current,limit);
        List<Prestore> list = prestoreService.getPrestoreBySearch(vo);
        long total = page.getTotal();
        return Result.ok().data("prestores",list).data("total",total);
    }

    /**
     * 查看预存
     */
    @GetMapping("/prestores/{current}/{limit}")
    public Result getAllPrestore(@PathVariable int current,@PathVariable int limit){
        Page<Prestore> page = PageHelper.startPage(current, limit);
        List<Prestore> list = prestoreService.getAllPrestore();
        long total = page.getTotal();
        return Result.ok().data("prestores",list).data("total",total);
    }

    /**
     * 查看某个老人的预存详情
     */
    @GetMapping("/getPrestoreByOldId/{id}")
    public Result getPrestoreByOldId(@PathVariable int id){
        List<Prestore> list = prestoreService.getPrestoreByOldId(id);
        return Result.ok().data("prestore",list);
    }
}
