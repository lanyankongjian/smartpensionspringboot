package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.OldsDao;
import com.example.smartpensionspringboot.lbb.pojos.Old;
import com.example.smartpensionspringboot.lbb.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OldServiceImpl implements OldService {
    @Autowired
    private OldsDao oldsDao;

    /**
     * 得到所有老人信息
     * @return
     */
    @Override
    public List<Old> getAllOld() {
        return oldsDao.getAllOld();
    }

    /**
     * 根据老人姓名得到老人信息
     * @param name
     * @return
     */
    @Override
    public Old getOldByName(String name) {
        return oldsDao.getOldByName(name);
    }
}
