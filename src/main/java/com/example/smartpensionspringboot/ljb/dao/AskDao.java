package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecAsk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface AskDao {

//    获取所有咨询人
    public List<RecAsk> getAllAsk();

//    添加咨询人
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public Long addAsk(RecAsk recAsk);

//    删除咨询人
    public void delAsk(Long id);

//    修改咨询人信息
    void upAsk(RecAsk recAsk);

}
