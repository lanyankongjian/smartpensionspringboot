package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.StaybackSet;
import com.example.smartpensionspringboot.hzj.service.StaybackSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class StaybackSetController {
    @Autowired
    private StaybackSetService staybackSetService;
    //    新增结算
    @RequestMapping("/insertStaybackSet")
    @ResponseBody
    public void insertStaybackSet(StaybackSet staybackSet) {
        staybackSetService.insertStaybackSet(staybackSet);
    }
    //    数据显示
    @RequestMapping("/selectStaybackSet")
    @ResponseBody
    public List<StaybackSet> selectStaybackSet() {
        return staybackSetService.selectStaybackSet();
    }
    //    根据姓名查询数据
    @RequestMapping("/selectStaybackName")
    @ResponseBody
    public List<StaybackSet> selectStaybackName(String setname){
        System.out.println(setname);
        return staybackSetService.selectStaybackName(setname);
    }
    //    修改状态
    @RequestMapping("/updetaStaybackSet")
    @ResponseBody
    public Integer updetaStaybackSet(String oldName) {
        return staybackSetService.updetaStaybackSet(oldName);
    }
}
