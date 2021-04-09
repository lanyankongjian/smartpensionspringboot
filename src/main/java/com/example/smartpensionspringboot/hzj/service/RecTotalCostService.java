package com.example.smartpensionspringboot.hzj.service;

import com.example.smartpensionspringboot.hzj.mapper.RecTotalCostMapper;
import com.example.smartpensionspringboot.hzj.pojos.RecTotalCost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecTotalCostService {
    @Autowired
    private RecTotalCostMapper recTotalCostMapper;

    public List<RecTotalCost> selectRecTotalCost(int oldid){
        return recTotalCostMapper.selectRecTotalCost(oldid);
    }
}
