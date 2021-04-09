package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.AskAndOldaskDao;
import com.example.smartpensionspringboot.ljb.vo.AskAndOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AskAndOldService implements AskAndOldaskDao {

    @Autowired
    private AskAndOldaskDao askAndOldaskDao;

    @Override
    public List<AskAndOld> getAskAndOld() {
        return askAndOldaskDao.getAskAndOld();
    }

    @Override
    public List<AskAndOld> conditionalQuery(AskAndOld askAndOld) {
        List<AskAndOld> askAndOlds = askAndOldaskDao.conditionalQuery(askAndOld);
        return askAndOlds;
    }
}
