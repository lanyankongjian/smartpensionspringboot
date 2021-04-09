package com.example.smartpensionspringboot.hzj.controller;

import com.example.smartpensionspringboot.hzj.service.OldDananVoService;
import com.example.smartpensionspringboot.hzj.vo.OldDananVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Controller", method = { RequestMethod.GET, RequestMethod.POST })
public class OldDananVoController {
    @Autowired
    private OldDananVoService oldDananVoService;
    //    根据id查询数据
    @RequestMapping("/selectOldDananVo")
    @ResponseBody
    public OldDananVo selectOldDananVo(Integer oldid) {
        System.out.println(oldid);
        return oldDananVoService.selectOldDananVO(oldid);
    }
}
