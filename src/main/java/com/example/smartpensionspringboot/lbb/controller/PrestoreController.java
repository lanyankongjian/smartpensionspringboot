package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.service.PrestoreService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
@Slf4j
public class PrestoreController {
    @Autowired
    private PrestoreService prestoreService;

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
        List<BigDecimal> decimals = new ArrayList<>();
        BigDecimal amount = null;
        for (int i = 0; i < list.size(); i++) {
            amount = list.get(i).getDetailStorage().getAmount();
            decimals.add(amount);
            log.info(amount.toString());
        }
        return Result.ok().data("prestore",list).data("amount",decimals);
    }
}
