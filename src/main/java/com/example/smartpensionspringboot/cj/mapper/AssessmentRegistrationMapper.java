package com.example.smartpensionspringboot.cj.mapper;

import com.example.smartpensionspringboot.cj.pojos.AssessmentRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AssessmentRegistrationMapper {
    List<AssessmentRegistration> selectAll(AssessmentRegistration assessmentRegistration);
    List<RecOld> selectName();
    void insert(AssessmentRegistration assessmentRegistration);
    void update(AssessmentRegistration assessmentRegistration);
    void delete(Integer arId);
}
