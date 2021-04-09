package com.example.smartpensionspringboot.liqing.service;

import com.example.smartpensionspringboot.liqing.mapper.LqbedMapper;
import com.example.smartpensionspringboot.liqing.mapper.LqfamilyMapper;
import com.example.smartpensionspringboot.liqing.mapper.LqoldMapper;
import com.example.smartpensionspringboot.liqing.mapper.LqregisterMapper;
import com.example.smartpensionspringboot.liqing.pojos.OldOutRegisterLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecBedLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecFamilyLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecOldLQ;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LqregisterService {
    @Autowired
    LqregisterMapper rm;

    @Autowired
    LqoldMapper om;

    @Autowired
    LqfamilyMapper fm;

    @Autowired
    LqbedMapper bm;

    /**
     * 查询所有登记来访
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<OldOutRegisterLQ> selectregister(Integer pageNo, Integer pageSize){
        //设置分页参数
        PageHelper.startPage(pageNo, pageSize);
        //调用mapper方法
        List<OldOutRegisterLQ> list = rm.selectregister();
        //将数据封装到PageInfo中
        PageInfo<OldOutRegisterLQ> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 根据老人id来查询家属信息
     * @param oldId
     * @return
     */
    public List<RecFamilyLQ> selectfamily(Integer oldId){
        return fm.selectfamliy(oldId);
    }

    /**
     * 根据老人id来查询床位号
     * @param oldId
     * @return
     */
    public RecBedLQ findbed(Integer oldId){
        return bm.findbed(oldId);
    }

    /**
     * 根据家属id来查询信息
     * @param familyId
     * @return
     */
    public RecFamilyLQ findfamily(Integer familyId){
        return fm.findfamily(familyId);
    }

    /**
     * 新增登记来访
     * @param r
     * @return
     */
    public Integer insertrigister(OldOutRegisterLQ r){
        return rm.insertrigister(r);
    }

    /**
     * 修改登记来访
     * @param r
     * @return
     */
    public Integer updaterigister(OldOutRegisterLQ r){
        return rm.updaterigister(r);
    }

    /**
     * 删除登记来访
     * @param orId
     * @return
     */
    public Integer deleteregister(Long orId){
        return rm.deleteregister(orId);
    }


    /**
     * 查询未返回的老人
     * @return
     */
    public List<RecOldLQ> selectAllold(){
        return om.selectAllold();
    }


        //高级查询
    public PageInfo<OldOutRegisterLQ>adQueryrigister(String oldName,Integer orBack,String sartDate,String endDate,Integer pageNo, Integer pageSize){
        //设置分页参数
        PageHelper.startPage(pageNo, pageSize);
        //调用mapper方法
        List<OldOutRegisterLQ> list = rm.adQueryrigister(oldName, orBack, sartDate, endDate);
        //将数据封装到PageInfo中
        PageInfo<OldOutRegisterLQ> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 批量逻辑删除
     * @param params
     * @return
     */
    public Integer logicDeleteregisters(List<Integer> params) {
        return rm.logicDeleteregisters(params);
    }

    /**
     * 删除历史
     * @return
     */
    public List<OldOutRegisterLQ> history(){
        return rm.history();
    }

    /**
     * 查询超过计划时间的老人
     * @return
     */
    public List<OldOutRegisterLQ> overtimes(){
        return rm.overtimes();
    }
}
