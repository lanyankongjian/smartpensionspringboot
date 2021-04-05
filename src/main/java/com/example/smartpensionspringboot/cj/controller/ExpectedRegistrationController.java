package com.example.smartpensionspringboot.cj.controller;

import com.example.smartpensionspringboot.cj.pojos.ExpectedRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.cj.service.ExpectedRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ExpectedRegistration")
public class ExpectedRegistrationController {
    @Autowired //自动装配方式
    ExpectedRegistrationService expectedRegistrationService;
    @RequestMapping("/selectAll")
    public List<ExpectedRegistration> selectAll(@RequestBody(required = false) ExpectedRegistration expectedRegistration){
        return expectedRegistrationService.selectAll(expectedRegistration);
    }
    @GetMapping("/selectName")
    public List<RecOld> selectName(){
        return expectedRegistrationService.selectName();
    }
    @PostMapping("/insert")
    public void insert(@RequestBody ExpectedRegistration expectedRegistration){
        expectedRegistrationService.insert(expectedRegistration);
    }
    @PostMapping("/delete")
    //@RequestParam将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
    public void delete(@RequestParam("regId") Integer regId){
        expectedRegistrationService.delete(regId);
    }
    @PostMapping("/update")
    public void update(@RequestBody ExpectedRegistration expectedRegistration){
        expectedRegistrationService.update(expectedRegistration);
    }
}
