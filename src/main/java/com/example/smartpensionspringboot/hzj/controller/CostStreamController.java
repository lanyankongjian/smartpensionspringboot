package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.CostStream;
import com.example.smartpensionspringboot.hzj.service.CostStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class CostStreamController {
    @Autowired
    private CostStreamService streamService;
//    根据id查询数据
    @RequestMapping("/selectCostSteam")
    @ResponseBody
    public List<CostStream> selectCostStream(int oldid) {
        return streamService.selectCostStream(oldid);
    }
}
