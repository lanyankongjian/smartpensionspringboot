package com.example.smartpensionspringboot.cj.service;

import com.example.smartpensionspringboot.cj.mapper.ExpectedRegistrationMapper;
import com.example.smartpensionspringboot.cj.pojos.ExpectedRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ExpectedRegistrationService {
    @Autowired
    ExpectedRegistrationMapper expectedRegistrationMapper;
    public List<ExpectedRegistration> selectAll(ExpectedRegistration expectedRegistration){
        return expectedRegistrationMapper.selectAll(expectedRegistration);
    }
    public List<RecOld> selectName(){
        return expectedRegistrationMapper.selectName();
    }
    @Transactional
    public void insert(ExpectedRegistration expectedRegistration){
        try {
            if(expectedRegistration.getErOldName()!=null&&expectedRegistration.getPhyTime()!=null&&
            expectedRegistration.getPhyHospital()!=null&&expectedRegistration.getPhyHospital()!=" "&&
            expectedRegistration.getPhyExamination()!=null&&expectedRegistration.getPhyExamination()!=""){
                expectedRegistration.setUpdateTime(new Date());
                expectedRegistrationMapper.insert(expectedRegistration);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Transactional
    public void delete(Integer regId){
        try {
            if(regId !=null){
                expectedRegistrationMapper.delete(regId);
            }
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
    @Transactional
    public void update(ExpectedRegistration expectedRegistration){
        try {
            if(expectedRegistration.getErOldName()!=null&&expectedRegistration.getPhyTime()!=null&&
                    expectedRegistration.getPhyHospital()!=null&&expectedRegistration.getPhyHospital()!=" "&&
                    expectedRegistration.getPhyExamination()!=null&&expectedRegistration.getPhyExamination()!=""){
                expectedRegistration.setUpdateTime(new Date());
                expectedRegistration.setUpdateTime(new Date());
                expectedRegistrationMapper.update(expectedRegistration);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
