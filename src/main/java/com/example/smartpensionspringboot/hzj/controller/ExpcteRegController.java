package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.ExpectedRegistrations;
import com.example.smartpensionspringboot.hzj.service.ExpctedRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class ExpcteRegController {
    @Autowired
    private ExpctedRegService expctedRegService;
    //    根据id查询数据
    @RequestMapping("/selectExpctedReg")
    @ResponseBody
    public List<ExpectedRegistrations> selectExpctedReg(int oldid) {
        return expctedRegService.selectExpctedReg(oldid);
    }


}
