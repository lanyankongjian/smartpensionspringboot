package com.example.smartpensionspringboot.liqing.controller;

import com.example.smartpensionspringboot.liqing.pojos.*;
import com.example.smartpensionspringboot.liqing.service.LqacrecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/record")
public class LqacrecordController {
    @Autowired
    LqacrecordService as;

    /**
     * 查询所有意外记录
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/all")
    public PageInfo<OldAccidentRecordLQ> selectAllrecord(@RequestParam("pageNo")Integer pageNo, @RequestParam("pageSize")Integer pageSize){
        return as.selectAllrecord(pageNo, pageSize);
    }


    /**
     * 新增记录
     * @param r
     * @return
     */
    @RequestMapping("/insert")
    public Integer insertrecord(@RequestBody OldAccidentRecordLQ r){
        return as.insertrecord(r);
    }

    /**
     * 修改记录
     * @param r
     * @return
     */
    @RequestMapping("/update")
    public Integer updaterecord(@RequestBody OldAccidentRecordLQ r){
        return as.updaterecord(r);
    }

    /**
     * 查询所有值班护工
     * @return
     */
    @RequestMapping("/allnurse")
    public List<NurseLQ> selectnurse(){
        return as.selectnurse();
    }

    /**
     * 查询所有老人
     * @return
     */
    @RequestMapping("/allold")
    public List<RecOldLQ> findAllold(){
        return as.findAllold();
    }

    /**
     * 根据老人id获取床位号
     * @param oldId
     * @return
     */
    @RequestMapping("/findbed")
    public RecBedLQ findbed(@RequestParam("oldId")Integer oldId){
        return as.findbed(oldId);
    }

    /**
     * 查询所有意外类型
     * @return
     */
    @RequestMapping("/alltype")
    public List<OldAccidentTypeLQ> selectactype(){
        return as.selectactype();
    }

    /**
     * 根据类型id查询事故等级
     * @param atId
     * @return
     */
    @RequestMapping("/findlevel")
    public OldAccidentTypeLQ findlevel(@RequestParam("atId")Integer atId){
        return as.findlevel(atId);
    }

    /**
     * 高级查询
     * @param oldName
     * @param bed
     * @param nuName
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/adQuery")
    public PageInfo<OldAccidentRecordLQ> adQueryrecord(@RequestParam(value = "oldName",required = false)String oldName,@RequestParam(value = "bed",required = false)String bed,
                                                       @RequestParam(value = "nuName",required = false)String nuName,@RequestParam("pageNo")Integer pageNo, @RequestParam("pageSize")Integer pageSize){
        return as.adQueryrecord(oldName, bed, nuName, pageNo, pageSize);
    }

    /**
     * 批量逻辑删除服务
     * @param paramStr
     * @return
     */
    @RequestMapping("/logicDeletes")
    public Integer logicDeleterecirds(@RequestParam("paramStr") String paramStr) {
        //前端传过来的参数是一个字符串，进行分割成字符串数组   列如：1,2,3
        String[] paramStrArray = paramStr.split(",");
        List<Integer> params = new ArrayList<>();
        for (String s : paramStrArray) {
            params.add(new Integer(s));
        }
        return as.logicDeleterecirds(params);
    }

    /**
     * 历史删除
     * @return
     */
    @RequestMapping("/history")
    public List<OldAccidentRecordLQ> history(){
        return as.history();
    }

}
