package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.StaybackDengji;
import com.example.smartpensionspringboot.hzj.service.StaybackDengjiService;
import com.example.smartpensionspringboot.hzj.service.StaybackSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class StayDengjiController {
    @Autowired
    private StaybackDengjiService staybackDengjiService;
    //    新增
    @RequestMapping("/insertStaybackDengji")
    @ResponseBody
    public void insertStaybackDengji(StaybackDengji staybackDengji) {
        staybackDengjiService.insertStaybackDengji(staybackDengji);
    }
    //    数据显示
    @RequestMapping("/selectDengji")
    @ResponseBody
    public List<StaybackDengji> selectDengji() {
        return staybackDengjiService.selectDengji();
    }
    //    根据姓名查询
    @RequestMapping("/selectDengjiName")
    @ResponseBody
    public List<StaybackDengji> selectDengjiName(String oldname){

        return staybackDengjiService.selectDengjiName(oldname);
    }
}
