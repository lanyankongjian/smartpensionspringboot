package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.HealthInformationDao;
import com.example.smartpensionspringboot.ljb.pojos.RecHealthInformations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthInformationService implements HealthInformationDao {

    @Autowired
    HealthInformationDao healthInformationDao;

    /**
     * 添加健康信息
     * @param healthInformation
     */
    @Override
    public void addHealthInfo(RecHealthInformations healthInformation) {
        healthInformationDao.addHealthInfo(healthInformation);
    }

    @Override
    public RecHealthInformations getHealthByOldId(long id) {
        RecHealthInformations healthByOldId = healthInformationDao.getHealthByOldId(id);
        return healthByOldId;
    }

}
