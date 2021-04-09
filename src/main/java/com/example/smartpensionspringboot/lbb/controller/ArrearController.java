package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Arrear;
import com.example.smartpensionspringboot.lbb.service.ArrearService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sun.el.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class ArrearController {
    @Autowired
    private ArrearService arrearService;

    @GetMapping("/getAllArr/{current}/{limit}")
    public Result getAllArr(@PathVariable int current,
                            @PathVariable int limit){
        Page<Arrear> page = PageHelper.startPage(current, limit);
        List<Arrear> list = arrearService.getAllArrear();
        long total = page.getTotal();
        return Result.ok().data("arrs",list).data("total",total);
    }
}
