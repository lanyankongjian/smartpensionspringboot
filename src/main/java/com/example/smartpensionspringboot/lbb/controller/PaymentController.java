package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Payment;
import com.example.smartpensionspringboot.lbb.service.PaymentService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.example.smartpensionspringboot.lbb.vo.PaymentVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    /**
     * 查看全部交费信息
     * @param current
     * @param limit
     * @return
     */
    @GetMapping("/getPayment/{current}/{limit}")
    public Result getPayment(@PathVariable int current,@PathVariable int limit){
        Page<Payment> page = PageHelper.startPage(current, limit);
        List<Payment> list = paymentService.getPayment();
        long total = page.getTotal();
        return Result.ok().data("payments",list).data("total",total);
    }

    /**
     * 搜索交费信息
     * @param current
     * @param limit
     * @return
     */
    @PostMapping("/getPaymentBySearch/{current}/{limit}")
    public Result getPaymentBySearch(@PathVariable int current,
                                     @PathVariable int limit,
                                     @RequestBody(required = false) PaymentVo vo){
        Page<Payment> page = PageHelper.startPage(current, limit);
        List<Payment> list = paymentService.getPaymentBySearch(vo);
        long total = page.getTotal();
        return Result.ok().data("payments",list).data("total",total);
    }
}
