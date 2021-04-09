package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.RecOldHzj;
import com.example.smartpensionspringboot.hzj.service.RecOldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class RecOldController {
    @Autowired
    private RecOldService recOldService;
    //查询所有老人信息
    @RequestMapping("/selectRecOld")
    @ResponseBody
    public List<RecOldHzj> selectRecOld(){
        return recOldService.selectRecOld();
    }
    //根据老人姓名查询
    @RequestMapping("/selectOldName")
    @ResponseBody
    public List<RecOldHzj> selectOldName(String OldName) {
        System.out.println(OldName);
        return recOldService.selectOldName(OldName);
    }
    //    根据id查询数据
    @RequestMapping("/updateStatus")
    @ResponseBody
    public Integer updateStatus(int oldid) {
        return recOldService.updateStatus(oldid);
    }

}
