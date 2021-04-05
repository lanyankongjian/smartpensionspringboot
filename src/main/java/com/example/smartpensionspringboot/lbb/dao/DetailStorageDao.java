package com.example.smartpensionspringboot.lbb.dao;

import com.example.smartpensionspringboot.lbb.pojos.DetailStorage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailStorageDao {
    //查看预存详情
    public List<DetailStorage> getDetailStorage();

    //查看某个老人预存详情
    public List<DetailStorage> getDetailStorageByOldId(int id);

    /*
    预存充值
    */
    public int addDetailStorage(DetailStorage detailStorage);
}
