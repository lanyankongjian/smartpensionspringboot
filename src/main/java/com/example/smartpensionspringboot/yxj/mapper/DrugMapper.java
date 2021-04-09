package com.example.smartpensionspringboot.yxj.mapper;

import com.example.smartpensionspringboot.yxj.pojos.Categorys;
import com.example.smartpensionspringboot.yxj.pojos.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DrugMapper {

    /**
     * 查询药品字典表和药品类别表
     * @param a
     * @param b
     * @return
     */
    List<Drug> drugList(@Param("drugCode") String a, @Param("drugName") String b);

    /**
     * 查询类别表
     * @return
     */
    List<Categorys> categoryList();

    /**
     * 新增药品数据
     * @param d
     */
    void saveDrug(Drug d);

    /**
     * 药品修改
     * @param d
     */
    void updateDrug(Drug d);

    /**
     * 药品删除
     * @param drugId
     */
    void deleteDrug(Integer drugId);

}
