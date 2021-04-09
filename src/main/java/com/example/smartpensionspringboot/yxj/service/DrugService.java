package com.example.smartpensionspringboot.yxj.service;

import com.example.smartpensionspringboot.yxj.mapper.DrugMapper;
import com.example.smartpensionspringboot.yxj.pojos.Categorys;
import com.example.smartpensionspringboot.yxj.pojos.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class DrugService {
    @Autowired
    DrugMapper drugMapper;

    /**
     * 查询两表
     * @param a
     * @param b
     * @return
     */
    public List<Drug> drugList(String a,String b){return drugMapper.drugList(a,b);}

    /**
     * 单独查询药品类别表
     * @return
     */
    public List<Categorys> categoryList(){return drugMapper.categoryList();}

    /**
     * 新增药品数据
     * @param d
     */
    public void saveDrug(Drug d){
        if (d.getDrugId() == null){
            drugMapper.saveDrug(d);
        }else {
            drugMapper.updateDrug(d);
        }
    }

    /**
     * 删除药品
     * @param drugId
     */
    public void deleteDrug(Integer drugId){
        drugMapper.deleteDrug(drugId);
    }



}
