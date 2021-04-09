package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.BedsDao;
import com.example.smartpensionspringboot.lbb.pojos.Bed;
import com.example.smartpensionspringboot.lbb.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BedServiceImpl implements BedService {
    @Autowired
    private BedsDao bedsDao;

    /**
     * 根据编号查找到床位
     * @param id
     * @return
     */
    @Override
    public Bed getBedByOldId(int id) {
        return bedsDao.getBedByOldId(id);
    }

    /**
     * 根据床位号查找到床位
     * @param bed
     * @return
     */
    @Override
    public Bed getBedByBed(String bed) {
        return bedsDao.getBedByBed(bed);
    }

    /**
     * 添加床位信息
     * @param bed
     */
    @Override
    public void addBed(Bed bed) {
        bedsDao.addBed(bed);
    }
}
