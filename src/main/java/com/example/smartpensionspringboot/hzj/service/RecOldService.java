package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.RecOldMapper;
import com.example.smartpensionspringboot.hzj.pojos.RecOldHzj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecOldService {
    @Autowired
    private RecOldMapper recOldMapper;
    //查询所有老人信息
    public List<RecOldHzj> selectRecOld(){
        return recOldMapper.selectRecOld();
    }
    //根据姓名查询老人
    public List<RecOldHzj> selectOldName(String OldName){
        return recOldMapper.selectOldName(OldName);
    }

    public Integer updateStatus(int oldid) {
        return recOldMapper.updateStatus(oldid);
    }

}
