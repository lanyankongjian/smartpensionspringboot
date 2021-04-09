package com.example.smartpensionspringboot.liqing.controller;

import com.example.smartpensionspringboot.liqing.pojos.NurseLQ;
import com.example.smartpensionspringboot.liqing.pojos.OldAccidentTypeLQ;
import com.example.smartpensionspringboot.liqing.service.LqactypeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/actype")
public class LqactypeController {
    @Autowired
    LqactypeService ats;

    /**
     * 查询所有意外类型
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/all")
    public PageInfo<OldAccidentTypeLQ> selectactype(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize){
        return ats.selectactype(pageNo, pageSize);
    }

    /**
     * 新增意外类型
     * @param type
     * @return
     */
    @RequestMapping("/insert")
    public Integer inserttype(@RequestBody OldAccidentTypeLQ type){
        OldAccidentTypeLQ typeLQ=ats.selectTypeByTname(type.getAtName(),type.getAtLevel());
        if(typeLQ !=null){
            if(typeLQ.getAtState()>0){
                System.out.println("已经是删除状态");
                ats.regaintype(type.getAtName());
                return -1;
            }else{
                System.out.println("已存在！");
                return 0;
            }
        }else {
            return ats.inserttype(type);
        }
    }

    /**
     * 修改意外类型
     * @param type
     * @return
     */
    @RequestMapping("/update")
    public Integer updatetype(@RequestBody OldAccidentTypeLQ type){
        return ats.updatetype(type);
    }

    /**
     * 查询所有护工
     * @return
     */
    @RequestMapping("/allnurse")
    public List<NurseLQ> selectnurse(){
        return ats.selectnurse();
    }

    /**
     * 根据护工id查询电话
     * @param nuId
     * @return
     */
    @RequestMapping("/findphone")
    public NurseLQ findphone(Integer nuId){
        return ats.findphone(nuId);
    }

    /**
     * 批量逻辑删除服务
     * @param paramStr
     * @return
     */
    @RequestMapping("/logicDeletes")
    public Integer logicDeletetypes(@RequestParam("paramStr") String paramStr) {
        //前端传过来的参数是一个字符串，进行分割成字符串数组   列如：1,2,3
        String[] paramStrArray = paramStr.split(",");
        List<Integer> params = new ArrayList<>();
        for (String s : paramStrArray) {
            params.add(new Integer(s));
        }
        return ats.logicDeletetypes(params);
    }

    /**
     * 批量逻辑删除服务
     * @param paramStr
     * @return
     */
    @RequestMapping("/logicRegain")
    public Integer logicregaintypes(@RequestParam("paramStr") String paramStr) {
        //前端传过来的参数是一个字符串，进行分割成字符串数组   列如：1,2,3
        String[] paramStrArray = paramStr.split(",");
        List<Integer> params = new ArrayList<>();
        for (String s : paramStrArray) {
            params.add(new Integer(s));
        }
        return ats.logicregaintypes(params);
    }

    /**
     * 删除历史
     * @return
     */
    @RequestMapping("/history")
    public List<OldAccidentTypeLQ> history(){
        return ats.history();
    }
}
