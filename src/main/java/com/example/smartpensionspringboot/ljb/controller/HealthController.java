package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.ljb.pojos.RecHealthInformations;
import com.example.smartpensionspringboot.ljb.service.HealthInformationService;
import com.example.smartpensionspringboot.ljb.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Transactional
@CrossOrigin
@RestController
@RequestMapping("/health")
public class HealthController {

    @Autowired
    private HealthInformationService healthInformationService;

    /**
     * 添加老人健康信息
     * @param healthInformation
     * @return
     */
    @PostMapping("/addHealth")
    public Result addHealth(@RequestBody RecHealthInformations healthInformation){

//        设置创建时间
        healthInformation.setCtime(new Date());

//        将健康信息录入数据库
        healthInformationService.addHealthInfo(healthInformation);
        Result result = new Result();
        result.setMessage("创建成功");
        return result;
    }

    /**
     * 根据老人id 获取健康信息
     * @param oldId
     * @return
     */
    @GetMapping("/getHealthByOldId")
    public Result getHealthByOldId(@Param("oldId")Long oldId){
        RecHealthInformations healthByOldId = healthInformationService.getHealthByOldId(oldId);
        Result result = new Result();
        result.setData(healthByOldId);
        result.setMessage("获取数据成功");
        return result;
    }
}
