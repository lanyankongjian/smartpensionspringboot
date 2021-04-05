package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Deposit;
import com.example.smartpensionspringboot.lbb.service.DepositService;
import com.example.smartpensionspringboot.lbb.util.Result;
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
}
