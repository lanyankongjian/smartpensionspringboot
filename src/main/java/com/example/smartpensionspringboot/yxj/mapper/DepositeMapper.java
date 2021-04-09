package com.example.smartpensionspringboot.yxj.mapper;

import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.yxj.pojos.Categorys;
import com.example.smartpensionspringboot.yxj.pojos.Deposite;
import com.example.smartpensionspringboot.yxj.pojos.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface DepositeMapper {

    /**
     * 查询药品，缴存，药品类别信息
     * @param a
     * @return
     */
    List<Map<String,Object>> depositeList(@Param("depositeMode") String a);


    /**
     * 查询老人信息
     * @return
     */
    List<RecOld> oldList();

    /**
     *  查询类别表
     * @return
     */
    List<Categorys> categoryList();

    /**
     * 查询药品和类别表
     * @param categoryId
     * @return
     */
    List<Drug> drcList(String categoryId);

    /**
     * 新增缴存
     * @param deposite
     */
     void savedeposite(Deposite deposite);

    /**
     * 修改状态
     * @param Id
     */
     void updatedeposite(Integer Id);
}
