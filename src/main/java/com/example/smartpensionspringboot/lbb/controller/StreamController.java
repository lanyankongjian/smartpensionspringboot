package com.example.smartpensionspringboot.lbb.controller;

import com.example.smartpensionspringboot.lbb.pojos.Stream;
import com.example.smartpensionspringboot.lbb.service.StreamService;
import com.example.smartpensionspringboot.lbb.util.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cost")
public class StreamController {
    @Autowired
    private StreamService streamService;

    /**
     * 查看费用流水
     */
    @GetMapping("/getStream/{current}/{limit}")
    public Result getStream(@PathVariable int current,@PathVariable int limit){
        Page<Stream> page = PageHelper.startPage(current,limit);
        List<Stream> list = streamService.getStream();
        long total = page.getTotal();
        return Result.ok().data("streams",list).data("total",total);
    }
}
