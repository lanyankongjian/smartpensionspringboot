package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Pay;
import com.example.smartpensionspringboot.lbb.service.PayService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.PayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class PayController {
    @Autowired
    private PayService payService;

    /**
     * 入住缴费
     */
    @PostMapping("/addPay")
    public Result addPay(@RequestBody PayVo vo){
        payService.addPay(vo);
        return Result.ok();
    }

    /**
     * 查看入住缴费信息
     */
    @GetMapping("/getPay")
    public Result getPay(){
        List<Pay> list = payService.getPay();
        return Result.ok().data("pays",list);
    }
}
