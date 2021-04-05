package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.OldDao;
import com.example.smartpensionspringboot.lbb.pojos.Old;
import com.example.smartpensionspringboot.lbb.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OldServiceImpl implements OldService {
    @Autowired
    private OldDao oldDao;

    /**
     * 得到所有老人信息
     * @return
     */
    @Override
    public List<Old> getAllOld() {
        return oldDao.getAllOld();
    }

    /**
     * 根据老人姓名得到老人信息
     * @param name
     * @return
     */
    @Override
    public Old getOldByName(String name) {
        return oldDao.getOldByName(name);
    }
}
