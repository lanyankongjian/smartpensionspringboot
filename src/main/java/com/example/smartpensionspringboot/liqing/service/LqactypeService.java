package com.example.smartpensionspringboot.liqing.service;

import com.example.smartpensionspringboot.liqing.mapper.LqactypeMapper;
import com.example.smartpensionspringboot.liqing.mapper.LqnurseMapper;
import com.example.smartpensionspringboot.liqing.pojos.NurseLQ;
import com.example.smartpensionspringboot.liqing.pojos.OldAccidentTypeLQ;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LqactypeService {
    @Autowired
    LqactypeMapper atm;

    @Autowired
    LqnurseMapper nm;

    /**
     * 查询所有意外类型
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<OldAccidentTypeLQ> selectactype(Integer pageNo, Integer pageSize){
        //设置分页参数
        PageHelper.startPage(pageNo, pageSize);
        //调用mapper方法
        List<OldAccidentTypeLQ> list = atm.selectactype();
        //将数据封装到PageInfo中
        PageInfo<OldAccidentTypeLQ> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 新增意外类型
     * @param type
     * @return
     */
    public Integer inserttype(OldAccidentTypeLQ type){
        return atm.inserttype(type);
    }

    /**
     * 修改意外类型
     * @param type
     * @return
     */
    public Integer updatetype(OldAccidentTypeLQ type){
        return atm.updatetype(type);
    }

    /**
     * 恢复意外类型
     * @param atName
     * @return
     */
    public Integer regaintype(String atName){
        return atm.regaintype(atName);
    }

    /**
     * 根据类型名称来查询
     * @param atName
     * @param atLevel
     * @return
     */
    public OldAccidentTypeLQ selectTypeByTname(String atName,String atLevel){
        return atm.selectTypeByTname(atName,atLevel);
    }

    /**
     * 查询所有护工
     * @return
     */
    public List<NurseLQ> selectnurse(){
        return nm.selectnurse();
    }

    /**
     * 根据护工id查询电话
     * @param nuId
     * @return
     */
    public NurseLQ findphone(Integer nuId){
        return nm.findphone(nuId);
    }

    /**
     * 批量逻辑删除
     * @param params
     * @return
     */
    public Integer logicDeletetypes(List<Integer> params) {
        return atm.logicDeletetypes(params);
    }

    /**
     * 批量逻辑恢复
     * @param params
     * @return
     */
    public Integer logicregaintypes(List<Integer> params) {
        return atm.logicregaintypes(params);
    }

    /**
     * 删除历史
     * @return
     */
    public List<OldAccidentTypeLQ> history(){
        return atm.history();
    }
}
