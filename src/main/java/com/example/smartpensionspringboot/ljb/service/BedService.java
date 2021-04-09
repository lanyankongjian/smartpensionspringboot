package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.BedDao;
import com.example.smartpensionspringboot.ljb.pojos.RecBed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedService implements BedDao {

    @Autowired
    private BedDao bedDao;
    @Override
    public void addBed(RecBed bed) {
        bedDao.addBed(bed);
    }

    @Override
    public RecBed getBedByOldId(long id) {
        return bedDao.getBedByOldId(id);
    }
}
