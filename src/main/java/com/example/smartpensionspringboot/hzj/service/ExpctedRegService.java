package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.ExpectedRegMapper;
import com.example.smartpensionspringboot.hzj.pojos.ExpectedRegistrations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpctedRegService {
    @Autowired
    private ExpectedRegMapper expectedRegMapper;
    public List<ExpectedRegistrations> selectExpctedReg(int oldid){
        return expectedRegMapper.selectExpctedReg(oldid);
    }
}
