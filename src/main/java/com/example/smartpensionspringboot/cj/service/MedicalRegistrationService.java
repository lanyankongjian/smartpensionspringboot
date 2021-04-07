package com.example.smartpensionspringboot.cj.service;

import com.example.smartpensionspringboot.cj.mapper.MedicalRegistrationMapper;
import com.example.smartpensionspringboot.cj.pojos.MedicalRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class MedicalRegistrationService {
    @Autowired
    MedicalRegistrationMapper medicalRegistrationMapper;
    public List<MedicalRegistration> selectAll(MedicalRegistration medicalRegistration){
       return medicalRegistrationMapper.selectAll(medicalRegistration);
    }
    public List<RecOld> selectName(){
        return medicalRegistrationMapper.selectName();
    }
    @Transactional
    public void insert(MedicalRegistration medicalRegistration){
        try {
            if(medicalRegistration.getMrOldName()!=null&&medicalRegistration.getMedicalTime()!=null&&
            medicalRegistration.getPhysician()!=null&&medicalRegistration.getPhysician()!=""&&
            medicalRegistration.getPlaceOfMedical()!=null&&medicalRegistration.getPlaceOfMedical()!=""&&
            medicalRegistration.getDiagnosisResults()!=null&&medicalRegistration.getDiagnosisResults()!=""){
                medicalRegistration.setUpdateTime(new Date());
                medicalRegistrationMapper.insert(medicalRegistration);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Transactional
    public void update(MedicalRegistration medicalRegistration){
        try {
            if(medicalRegistration.getMrOldName()!=null&&medicalRegistration.getMedicalTime()!=null&&
                    medicalRegistration.getPhysician()!=null&&medicalRegistration.getPhysician()!=""&&
                    medicalRegistration.getPlaceOfMedical()!=null&&medicalRegistration.getPlaceOfMedical()!=""&&
                    medicalRegistration.getDiagnosisResults()!=null&&medicalRegistration.getDiagnosisResults()!=""){
                medicalRegistration.setUpdateTime(new Date());
                medicalRegistrationMapper.update(medicalRegistration);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Transactional
    public void delete(Integer mrId){
        try {
            medicalRegistrationMapper.delete(mrId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
