package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Payment;
import com.example.smartpensionspringboot.lbb.service.PaymentService;
import com.example.smartpensionspringboot.lbb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getPayment")
    public Result getPayment(){
        List<Payment> list = paymentService.getPayment();
        return Result.ok().data("payments",list);
    }
}
