package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.AskDao;
import com.example.smartpensionspringboot.ljb.pojos.RecAsk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AskService implements AskDao {

    @Autowired
    private AskDao askDao;

    @Override
    public List<RecAsk> getAllAsk() {
        return askDao.getAllAsk();
    }

    @Override
    public Long addAsk(RecAsk recAsk) {
        //录入咨询人信息
        askDao.addAsk(recAsk);

        //返回咨询人的id
        return recAsk.getAskId();
    }

    @Override
    public void delAsk(Long id) {
        askDao.delAsk(id);
    }

    @Override
    public void upAsk(RecAsk recAsk) {
        askDao.upAsk(recAsk);
    }

}
