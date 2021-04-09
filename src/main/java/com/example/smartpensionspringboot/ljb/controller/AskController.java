package com.example.smartpensionspringboot.ljb.controller;

import com.example.smartpensionspringboot.ljb.pojos.RecAsk;
import com.example.smartpensionspringboot.ljb.service.AskService;
import com.example.smartpensionspringboot.ljb.util.Result;
import com.example.smartpensionspringboot.ljb.vo.AskAndOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ask")
public class AskController {

    @Autowired
    private AskService askService;

    /**
     * 获取所有的咨询人信息
     * @return
     */
    @GetMapping("/getAllAsk")
    public Result getgetAllAsk(){
        List<RecAsk> list = askService.getAllAsk();
       Result result = new Result();
       result.setData(list);
        result.setMessage("获取成功");
       return result;
        /*return new Result("获取成功",list);*/
    }

    /**
     * 创建
     * @param recAsk
     * @return
     */
    @Transactional
    @PostMapping("/createAsk")
    public Result createAsk(@RequestBody RecAsk recAsk){
        System.out.println(recAsk);
        recAsk.setAskDate(new Date());
        recAsk.setCtime(new Date());
        long ask = askService.addAsk(recAsk);
        Result result = new Result();
        result.setMessage("创建成功");
        return result;
    }

    /**
     * 删除单条咨询记录，会级联删除对应的咨询的老人信息
     * @param id
     * @return
     */
    @Transactional
    @GetMapping("/delAsk")
    public Result delAsk(@RequestParam("id") Long id){
        askService.delAsk(id);
        Result result = new Result();
        result.setMessage("删除成功");
        return result;
    }

    /**
     * 删除多条咨询记录，同时级联删除对应的咨询老人的信息
     * @param ids
     * @return
     */
    @Transactional
    @GetMapping("/removeAsks")
    public Result removeAsks(String ids){
        String[] split = ids.split(",");
        for (int i =0 ; i < split.length ; i++) {
            askService.delAsk(Long.valueOf(split[i])) ;
        }
        Result result = new Result();
        result.setMessage("删除成功");
        return result;
    }
}
