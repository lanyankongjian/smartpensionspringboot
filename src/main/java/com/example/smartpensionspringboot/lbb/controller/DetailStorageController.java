package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.DetailStorage;
import com.example.smartpensionspringboot.lbb.service.DetailStorageService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class DetailStorageController {
    @Autowired
    private DetailStorageService detailStorageService;

    /**
     * 所有预存详情
     * @return
     */
    @GetMapping("/getDetailStorage")
    public Result getDetailStorage(){
        List<DetailStorage> list = detailStorageService.getDetailStorage();
        return Result.ok().data("detailStorages",list);
    }

    /**
     * 某一老人预存详情
     * @param id
     * @return
     */
    @GetMapping("/getDetailStorageByOldId/{id}")
    public Result getDetailStorageByOldId(@PathVariable int id){
        List<DetailStorage> list = detailStorageService.getDetailStorageByOldId(id);
        return Result.ok().data("detailStorage",list);
    }

    /**
     * 新增预存详情
     * @param vo
     * @return
     */
    @PostMapping("/addDetailStorage")
    public Result addDetailStorage(@RequestBody PrestoreVo vo){
        detailStorageService.addDetailStorage(vo);
        return Result.ok();
    }
}
