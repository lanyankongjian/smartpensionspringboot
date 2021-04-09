package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.OldAskDao;
import com.example.smartpensionspringboot.ljb.pojos.RecOldask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OldAskService implements OldAskDao {

    @Autowired
    private OldAskDao oldAskDao;

    @Override
    public RecOldask getOldAsk(long id) {
        return null;
    }

    @Override
    public void addOldAsk(RecOldask recOldask) {
        oldAskDao.addOldAsk(recOldask);
    }

    @Override
    public void upOldAsk(RecOldask recOldask) {
        oldAskDao.upOldAsk(recOldask);
    }
}
