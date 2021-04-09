package com.example.smartpensionspringboot.liqing.controller;

import com.example.smartpensionspringboot.liqing.pojos.OldVisitLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecOldLQ;
import com.example.smartpensionspringboot.liqing.service.LqvisitService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visit")
public class LqvisitController {
    @Autowired
    LqvisitService vs;

    /**
     * 查询所有探视来访
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/all")
    public PageInfo<OldVisitLQ>selectAllvisit(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize){
        return vs.selectAllvisit(pageNo, pageSize);
    }

    /**
     * 新增探视来访
     * @param v
     * @return
     */
    @RequestMapping("/insert")
    public Integer insertvisit(@RequestBody OldVisitLQ v){
        return vs.insertvisit(v);
    }

    /**
     * 修改探视来访
     * @param v
     * @return
     */
    @RequestMapping("/update")
    public Integer updatevisit(@RequestBody OldVisitLQ v){
        return vs.updatevisit(v);
    }

    /**
     * 查询所有老人
     * @return
     */
    @RequestMapping("/allold")
    public List<RecOldLQ> findAllold(){
        return vs.findAllold();
    }

    //高级查询
    @RequestMapping("/adQuery")
    public PageInfo<OldVisitLQ> adQueryvisit(@RequestParam(value = "vCname", required = false) String  vCname,@RequestParam(value = "oldName", required = false) String oldName,
                                             @RequestParam(value = "sartDate", required = false) String sartDate,@RequestParam(value = "endDate", required = false) String endDate,
                                             @RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize){
        return vs.adQueryrigister(vCname, oldName, sartDate, endDate, pageNo, pageSize);
    }

    /**
     * 批量逻辑删除服务
     * @param paramStr
     * @return
     */
    @RequestMapping("/logicDeletes")
    public Integer logicDeleteServers(@RequestParam("paramStr") String paramStr) {
        //前端传过来的参数是一个字符串，进行分割成字符串数组   列如：1,2,3
        String[] paramStrArray = paramStr.split(",");
        List<Integer> params = new ArrayList<>();
        for (String s : paramStrArray) {
            params.add(new Integer(s));
        }
        return vs.logicDeleteServers(params);
    }

    /**
     * 删除历史
     * @return
     */
    @RequestMapping("/history")
    public List<OldVisitLQ> history(){
        return vs.history();
    }

}
