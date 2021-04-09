package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.CostStreamMapper;
import com.example.smartpensionspringboot.hzj.pojos.CostStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostStreamService {
    @Autowired
    private CostStreamMapper costStreamMapper;

    public List<CostStream> selectCostStream(int oldid) {
        return costStreamMapper.selectCostStream(oldid);
    }
}
