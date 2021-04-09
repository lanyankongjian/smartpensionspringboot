package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.FamilyDao;
import com.example.smartpensionspringboot.ljb.pojos.RecFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService implements FamilyDao {

    @Autowired
    private FamilyDao familyDao;

    @Override
    public List<RecFamily> getFamilyByOldId(long oldId) {
        List<RecFamily> familys = familyDao.getFamilyByOldId(oldId);
        return familys;
    }

    @Override
    public void addFamily(RecFamily family) {
        familyDao.addFamily(family);
    }
}
