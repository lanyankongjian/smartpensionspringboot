package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.RecFamilys;
import com.example.smartpensionspringboot.hzj.service.RecFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class RecFamilyController {
    @Autowired
    private RecFamilyService recFamilyService;
    //    根据id查询数据
    @RequestMapping("/selectFamily")
    @ResponseBody
    public List<RecFamilys> selectFamily(int oldid) {
        return recFamilyService.selectFamily(oldid);
    }
}
