package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Old;
import com.example.smartpensionspringboot.lbb.service.OldService;
import com.example.smartpensionspringboot.lbb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rec")
public class OldController {
    @Autowired
    private OldService oldService;

    @GetMapping("/old")
    public Result getAllOld(){
        List<Old> list = oldService.getAllOld();
        return Result.ok().data("olds",list);
    }
}
