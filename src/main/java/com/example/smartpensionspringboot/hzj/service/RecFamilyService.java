package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.RecFamilyMapper;
import com.example.smartpensionspringboot.hzj.pojos.RecFamilys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecFamilyService {
    @Autowired
    private RecFamilyMapper recFamilyMapper;
    public List<RecFamilys> selectFamily(int oldid){
        return recFamilyMapper.selectFamily(oldid);
    }
}
