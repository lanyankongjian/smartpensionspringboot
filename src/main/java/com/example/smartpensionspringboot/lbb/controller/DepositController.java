package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import com.example.smartpensionspringboot.lbb.service.DepositService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.DepositVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class DepositController {
    @Autowired
    private DepositService depositService;

    /**
     * 查看押金
     */
    @GetMapping("/deposits/{current}/{limit}")
    public Result getAllDeposit(@PathVariable int current,@PathVariable int limit){
        Page<Deposit> page = PageHelper.startPage(current, limit);
        List<Deposit> list = depositService.getAllDeposit();
        long total = page.getTotal();
        return Result.ok().data("deposits",list).data("total",total);
    }

    /**
     * 根据编号查看押金
     * @param id
     * @return
     */
    @GetMapping("/getDepositById/{id}")
    public Result getDepositById(@PathVariable int id){
        Deposit deposit = depositService.getDepositById(id);
        return Result.ok().data("deposit",deposit);
    }

    /**
     * 搜索押金
     */
    @PostMapping("/getDepositBySearch/{current}/{limit}")
    public Result getDepositBySearch(@PathVariable int current,
                                     @PathVariable int limit,
                                     @RequestBody(required = false) DepositVo vo){
        Page<Deposit> page = PageHelper.startPage(current, limit);
        List<Deposit> list = depositService.getDepositBySearch(vo);
        long total = page.getTotal();
        return Result.ok().data("deposits",list).data("total",total);
    }
}
