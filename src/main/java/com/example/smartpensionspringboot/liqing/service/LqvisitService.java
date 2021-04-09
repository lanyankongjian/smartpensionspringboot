package com.example.smartpensionspringboot.liqing.service;

import com.example.smartpensionspringboot.liqing.mapper.LqoldMapper;
import com.example.smartpensionspringboot.liqing.mapper.LqvisitMapper;
import com.example.smartpensionspringboot.liqing.pojos.OldVisitLQ;
import com.example.smartpensionspringboot.liqing.pojos.RecOldLQ;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LqvisitService {
    @Autowired
    LqvisitMapper vm;

    @Autowired
    LqoldMapper om;

    //查询所有
    public PageInfo<OldVisitLQ> selectAllvisit(Integer pageNo,Integer pageSize){
        //设置分页参数
        PageHelper.startPage(pageNo, pageSize);
        //调用mapper方法
        List<OldVisitLQ> list = vm.selectAllvisit();
        //将数据封装到PageInfo中
        PageInfo<OldVisitLQ> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    //新增
    public Integer insertvisit(OldVisitLQ v){
        return vm.insertvisit(v);
    }

    //修改
    public Integer updatevisit(OldVisitLQ v){
        return vm.updatevisit(v);
    }

    //查询所有老人
    public List<RecOldLQ> findAllold(){
        return om.findAllold();
    }

    //高级查询
    public PageInfo<OldVisitLQ>adQueryrigister(String vCname,String oldName,String sartDate,String endDate,Integer pageNo, Integer pageSize){
        //设置分页参数
        PageHelper.startPage(pageNo, pageSize);
        //调用mapper方法
        List<OldVisitLQ> list = vm.adQueryvisit(vCname, oldName, sartDate, endDate);
        //将数据封装到PageInfo中
        PageInfo<OldVisitLQ> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    //批量逻辑删除
    public Integer logicDeleteServers(List<Integer> params) {
        return vm.logicDeleteVisits(params);
    }

    //删除历史
    public List<OldVisitLQ> history(){
        return vm.history();
    }
}
