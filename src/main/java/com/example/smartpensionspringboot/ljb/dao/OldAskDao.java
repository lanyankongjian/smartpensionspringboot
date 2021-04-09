package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecOldask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OldAskDao {
//    根据id获取咨询老人id
    public RecOldask getOldAsk(long id);

//    添加咨询老人
    public void addOldAsk(RecOldask recOldask);

//    修改咨询老人
    void upOldAsk(RecOldask recOldask);

}
