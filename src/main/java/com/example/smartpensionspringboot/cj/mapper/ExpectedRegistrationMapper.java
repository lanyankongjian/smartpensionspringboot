package com.example.smartpensionspringboot.cj.mapper;

import com.example.smartpensionspringboot.cj.pojos.ExpectedRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository //标注为DAO层
public interface ExpectedRegistrationMapper {
    List<ExpectedRegistration> selectAll(ExpectedRegistration expectedRegistration);
    List<RecOld> selectName();
    void insert(ExpectedRegistration expectedRegistration);
    void delete(Integer regId);
    void update(ExpectedRegistration expectedRegistration);
}
