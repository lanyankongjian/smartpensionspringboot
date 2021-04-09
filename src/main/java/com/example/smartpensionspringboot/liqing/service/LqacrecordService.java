package com.example.smartpensionspringboot.liqing.service;

import com.example.smartpensionspringboot.liqing.mapper.*;
import com.example.smartpensionspringboot.liqing.pojos.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LqacrecordService {
    @Autowired
    LqacrecordMapper am;

    @Autowired
    LqoldMapper om;

    @Autowired
    LqnurseMapper nm;

    @Autowired
    LqactypeMapper atm;

    @Autowired
    LqbedMapper bm;

    /**
     * 查询所有意外记录
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<OldAccidentRecordLQ> selectAllrecord(Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<OldAccidentRecordLQ> list = am.selectAllrecord();
        PageInfo<OldAccidentRecordLQ> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 新增意外记录
     * @param r
     * @return
     */
    public Integer insertrecord(OldAccidentRecordLQ r){
        return am.insertrecord(r);
    }

    /**
     * 修改意外记录
     * @param r
     * @return
     */
    public Integer updaterecord(OldAccidentRecordLQ r){
        return am.updaterecord(r);
    }

    /**
     * 查询所有老人
     * @return
     */
    public List<RecOldLQ> findAllold(){
        return om.findAllold();
    }

    /**
     * 根据老人id获取床位号
     * @param oldId
     * @return
     */
    public RecBedLQ findbed(Integer oldId){
        return bm.findbed(oldId);
    }

    /**
     * 查询所有值班护工
     * @return
     */
    public List<NurseLQ> selectnurse(){
        return nm.selectnurse();
    }

    /**
     * 查询所有意外类型
     * @return
     */
    public List<OldAccidentTypeLQ> selectactype(){
        return atm.selectactype();
    }

    /**
     * 根据类型id查询事故等级
     * @param atId
     * @return
     */
    public OldAccidentTypeLQ findlevel(Integer atId){
        return atm.findlevel(atId);
    }

    //高级查询
    public PageInfo<OldAccidentRecordLQ> adQueryrecord(String oldName,String bed,String nuName,Integer pageNo,Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<OldAccidentRecordLQ> list=am.adQueryrecord(oldName, bed, nuName);
        PageInfo<OldAccidentRecordLQ> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 批量逻辑删除
     * @param params
     * @return
     */
    public Integer logicDeleterecirds(List<Integer> params) {
        return am.logicDeleterecirds(params);
    }

    /**
     * 历史删除
     * @return
     */
    public List<OldAccidentRecordLQ> history(){
        return am.history();
    }
}
