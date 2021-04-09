package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.ljb.dao.NursingDao;
import com.example.smartpensionspringboot.ljb.pojos.RecNursing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingService implements NursingDao {
    @Autowired
    private NursingDao nursingDao;

    @Override
    public void addNursing(RecNursing recNursing) {
        nursingDao.addNursing(recNursing);
    }

    @Override
    public void upNursing(RecNursing recNursing) {
        nursingDao.upNursing(recNursing);
    }

    @Override
    public List<RecNursing> getNursingByOldId(long id) {
        return nursingDao.getNursingByOldId(id);
    }
}
