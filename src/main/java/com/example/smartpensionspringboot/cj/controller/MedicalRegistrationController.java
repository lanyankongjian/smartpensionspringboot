package com.example.smartpensionspringboot.cj.controller;

import com.example.smartpensionspringboot.cj.pojos.MedicalRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.cj.service.MedicalRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/MedicalRegistration")
public class MedicalRegistrationController {
    @Autowired //自动装配方式
    MedicalRegistrationService medicalRegistrationService;
    @RequestMapping("/selectAll")
    public List<MedicalRegistration> selectAll(@RequestBody(required = false)MedicalRegistration medicalRegistration){
        return medicalRegistrationService.selectAll(medicalRegistration);
    }
    @GetMapping("/selectName")
    public List<RecOld> selectName(){
        return medicalRegistrationService.selectName();
    }
    @PostMapping("/insert")
    public void insert(@RequestBody MedicalRegistration medicalRegistration){
        medicalRegistrationService.insert(medicalRegistration);
    }
    @PostMapping("/delete")
    //@RequestParam将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
    public void delete(@RequestParam("mrId") Integer mrId){
        medicalRegistrationService.delete(mrId);
    }
    @PostMapping("/update")
    public void update(@RequestBody MedicalRegistration medicalRegistration){
        medicalRegistrationService.update(medicalRegistration);
    }
}
