package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.PrestoreDao;
import com.example.smartpensionspringboot.lbb.exeception.GuliException;
import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.service.PrestoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
public class PrestoreServiceImpl implements PrestoreService {
    @Autowired
    private PrestoreDao prestoreDao;

    /**
     * 查看预存
     * @return
     */
    @Override
    public List<Prestore> getAllPrestore() {
        return prestoreDao.getAllPrestore();
    }


    /**
     * 查看某个老人的预存详情
     * @param id
     * @return
     */
    @Override
    public List<Prestore> getPrestoreByOldId(int id) {
        return prestoreDao.getPrestoreByOldId(id);
    }

    /**
     * 新增预存
     * @param prestore
     * @return
     */
    @Override
    public int addPrestore(Prestore prestore) {
        int i = prestoreDao.addPrestore(prestore);
        if (i > 0){
            return i;
        }else {
            throw new GuliException(201,"新增预存失败");
        }
    }
}
