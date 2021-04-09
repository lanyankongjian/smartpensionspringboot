package com.example.smartpensionspringboot.cj.service;

import com.example.smartpensionspringboot.cj.mapper.AssessmentRegistrationMapper;
import com.example.smartpensionspringboot.cj.pojos.AssessmentRegistration;
import com.example.smartpensionspringboot.cj.pojos.RecOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AssessmentRegistrationService {
    @Autowired
    AssessmentRegistrationMapper assessmentRegistrationMapper;
    public List<AssessmentRegistration> selectAll(AssessmentRegistration assessmentRegistration){
        return assessmentRegistrationMapper.selectAll(assessmentRegistration);
    }
    public List<RecOld> selectName(){
        return assessmentRegistrationMapper.selectName();
    }
    @Transactional(rollbackFor = Exception.class)
    //如果想保证非RuntimeException错误的回滚，需要加上rollbackFor = Exception.class 参数
    public void insert(AssessmentRegistration assessmentRegistration) {
        assessmentRegistration.setUpdateTime(new Date());
        assessmentRegistrationMapper.insert(assessmentRegistration);
    }
    @Transactional(rollbackFor = Exception.class)
    public void update(AssessmentRegistration assessmentRegistration){
        assessmentRegistration.setUpdateTime(new Date());
        assessmentRegistrationMapper.update(assessmentRegistration);
    }
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer arId){
        assessmentRegistrationMapper.delete(arId);
    }
}
