package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.DetailStorage;
import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;

import java.util.List;

public interface DetailStorageService {
    //查看预存详情
    public List<DetailStorage> getDetailStorage();

    //查看某个老人预存详情
    public List<DetailStorage> getDetailStorageByOldId(int id);

    /*
    预存充值
    */
    public int addDetailStorage(PrestoreVo vo);
}
