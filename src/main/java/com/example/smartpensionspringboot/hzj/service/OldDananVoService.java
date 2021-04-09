package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.OldDananVoMapper;
import com.example.smartpensionspringboot.hzj.vo.OldDananVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OldDananVoService {
    @Autowired
    private OldDananVoMapper oldDananVoMapper;
    public OldDananVo selectOldDananVO(Integer oldid) {
        return oldDananVoMapper.selectOldDananVO(oldid);
    }
}
