package com.example.smartpensionspringboot.cj.controller;

import com.example.smartpensionspringboot.cj.pojos.AssessmentRegistration;
import com.example.smartpensionspringboot.cj.pojos.ExpectedRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.cj.service.AssessmentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AssessmentRegistration")
public class AssessmentRegistrationController {
    @Autowired
    AssessmentRegistrationService assessmentRegistrationService;
    @RequestMapping("/selectAll")
    public List<AssessmentRegistration> selectAll(@RequestBody(required = false) AssessmentRegistration assessmentRegistration){
        return assessmentRegistrationService.selectAll(assessmentRegistration);
    }
    @GetMapping("/selectName")
    public List<RecOld> selectName(){
        return assessmentRegistrationService.selectName();
    }
    @PostMapping("/insert")
    public void insert(@RequestBody AssessmentRegistration assessmentRegistration) {
        assessmentRegistrationService.insert(assessmentRegistration);
    }
    @PostMapping("/delete")
    //@RequestParam将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
    public void delete(@RequestParam("arId") Integer arId){
        assessmentRegistrationService.delete(arId);
    }
    @PostMapping("/update")
    public void update(@RequestBody AssessmentRegistration assessmentRegistration){
        assessmentRegistrationService.update(assessmentRegistration);
    }
}
