package com.example.smartpensionspringboot.cj.mapper;

import com.example.smartpensionspringboot.cj.pojos.MedicalRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MedicalRegistrationMapper {
    List<MedicalRegistration> selectAll(MedicalRegistration medicalRegistration);
    List<RecOld> selectName();
    void insert(MedicalRegistration medicalRegistration);
    void update(MedicalRegistration medicalRegistration);
    void delete(Integer mrId);
}
