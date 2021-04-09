package com.example.smartpensionspringboot.liqing.controller;

import com.example.smartpensionspringboot.liqing.pojos.OldOutRegisterLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecBedLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecFamilyLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecOldLQ;
import com.example.smartpensionspringboot.liqing.service.LqregisterService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/register")
public class LqregisterController {
    @Autowired
    LqregisterService rs;

    /**
     * 查询所有登记外出
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/all")
    public PageInfo<OldOutRegisterLQ> selectregister(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        return rs.selectregister(pageNo, pageSize);
    }

    /**
     * 新增登记外出
     * @param r
     * @return
     */
    @RequestMapping("/insert")
    public Integer insertrigister(@RequestBody OldOutRegisterLQ r) {
        return rs.insertrigister(r);
    }

    /**
     * 修改登记外出
     * @param r
     * @return
     */
    @RequestMapping("/update")
    public Integer updaterigister(@RequestBody OldOutRegisterLQ r) {
        return rs.updaterigister(r);
    }

    /**
     * 删除登记外出
     * @param orId
     * @return
     */
    @RequestMapping("/delete")
    public Integer deletereigister(@RequestParam("orId") Long orId) {
        return rs.deleteregister(orId);
    }

    /**
     * 根据老人id来查询家属信息
     * @param oldId
     * @return
     */
    @RequestMapping("/findfamily")
    public List<RecFamilyLQ> selectfamily(@RequestParam("oldId") Integer oldId) {
        return rs.selectfamily(oldId);
    }

    /**
     * 根据老人id来查询床位号
     * @param oldId
     * @return
     */
    @RequestMapping("/findbed")
    public RecBedLQ findbed(@RequestParam("oldId") Integer oldId) {
        return rs.findbed(oldId);
    }

    //根据家属id来查询信息
    @RequestMapping("/familyinfo")
    public RecFamilyLQ findfamily(@RequestParam("familyId") Integer familyId) {
        return rs.findfamily(familyId);
    }

    /**
     * 查询未返回的老人、
     * @return
     */
    @RequestMapping("/allold")
    public List<RecOldLQ> selectAllold() {
        return rs.selectAllold();
    }


    //高级查询
    @RequestMapping("/adQuery")
    public PageInfo<OldOutRegisterLQ> adQueryregister(@RequestParam(value = "oldName", required = false) String oldName, @RequestParam(value = "orBack", required = false) Integer orBack,
                                                      @RequestParam(value = "sartDate", required = false) String sartDate, @RequestParam(value = "endDate", required = false) String endDate,
                                                      @RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        return rs.adQueryrigister(oldName, orBack, sartDate, endDate, pageNo, pageSize);
    }

    /**
     * 批量逻辑删除服务
     * @param paramStr
     * @return
     */
    @RequestMapping("/logicDeletes")
    public Integer logicDeleteregisters(@RequestParam("paramStr") String paramStr) {
        //前端传过来的参数是一个字符串，进行分割成字符串数组   列如：1,2,3
        String[] paramStrArray = paramStr.split(",");
        List<Integer> params = new ArrayList<>();
        for (String s : paramStrArray) {
            params.add(new Integer(s));
        }
        return rs.logicDeleteregisters(params);
    }

    /**
     * 删除历史
     * @return
     */
    @RequestMapping("/history")
    public List<OldOutRegisterLQ> history() {
        return rs.history();
    }

    /**
     * /超过计划时间未归的老人
     * @return
     */
    @RequestMapping("/overtimes")
    public List<OldOutRegisterLQ> overtimes() {
        return rs.overtimes();
    }
}
