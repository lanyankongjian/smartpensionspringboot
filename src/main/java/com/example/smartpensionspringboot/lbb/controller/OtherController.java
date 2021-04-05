package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.service.OtherService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.OtherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class OtherController {
    @Autowired
    private OtherService otherService;

    /**
     * 消费登记
     */
    @PostMapping("/addOther")
    public Result addOther(@RequestBody OtherVo vo){
        System.out.println(vo);
        otherService.addOther(vo);
        return Result.ok();
    }
}
