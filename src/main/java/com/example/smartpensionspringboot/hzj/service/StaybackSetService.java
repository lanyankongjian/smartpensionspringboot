package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.StaybackSetMapper;
import com.example.smartpensionspringboot.hzj.pojos.StaybackSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaybackSetService {
    @Autowired
    private StaybackSetMapper staybackSetMapper;
    public void insertStaybackSet(StaybackSet staybackSet){
        staybackSetMapper.insertStaybackSet(staybackSet);
    }

    public List<StaybackSet> selectStaybackSet(){
        return staybackSetMapper.selectStaybackSet();
    }

    public List<StaybackSet> selectStaybackName(String setname){
        return staybackSetMapper.selectStaybackName(setname);
    }

    public Integer updetaStaybackSet(String oldName) {
        return staybackSetMapper.updetaStaybackSet(oldName);
    }
}
