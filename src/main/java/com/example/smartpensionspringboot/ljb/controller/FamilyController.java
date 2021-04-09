package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.ljb.pojos.RecFamily;
import com.example.smartpensionspringboot.ljb.service.FamilyService;
import com.example.smartpensionspringboot.ljb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/family")
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @PostMapping("/addFamily")
    public Result addFamily(@RequestBody RecFamily family){
        //设置创建时间
        family.setCtime(new Date());

//        加入到数据库
        familyService.addFamily(family);
        Result result = new Result();
        result.setMessage("创建成功");
        return result;
    }


    /**
     * 根据老人id 获取家属信息
     * @param id
     * @return
     */
    @GetMapping("/getFamilyByOldId")
    public Result getFamilyByOldId(@RequestParam("oldId") long id){
        List<RecFamily> family = familyService.getFamilyByOldId(id);
        Result result = new Result();
        result.setData(family);
        result.setMessage("获取数据成功");
        return result;
    }
}
