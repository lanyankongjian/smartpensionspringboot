package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.StaybackDengjiMapper;
import com.example.smartpensionspringboot.hzj.pojos.StaybackDengji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaybackDengjiService {
    @Autowired
    private StaybackDengjiMapper staybackDengjiMapper;

    public void insertStaybackDengji(StaybackDengji staybackDengji) {
        staybackDengjiMapper.insertStaybackDengji(staybackDengji);
    }

    public List<StaybackDengji> selectDengji() {
        return staybackDengjiMapper.selectDengji();
    }

    public List<StaybackDengji> selectDengjiName(String oldname){
        return staybackDengjiMapper.selectDengjiName(oldname);
    }
}
