package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.pojos.RecTotalCost;
import com.example.smartpensionspringboot.hzj.service.RecTotalCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class RecTotalController {
    @Autowired
    private RecTotalCostService recTotalCostService;
    //    根据id查询数据
    @RequestMapping("/selectRecTotalCost")
    @ResponseBody
    public List<RecTotalCost> selectRecTotalCost(int oldid){
        return recTotalCostService.selectRecTotalCost(oldid);
    }


}
