package com.example.smartpensionspringboot.ljb.service;

import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.ljb.dao.OldDao;
import com.example.smartpensionspringboot.ljb.pojos.RecOld2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OldService implements OldDao {

    @Autowired
    private OldDao oldDao;

    /**
     * 获取所有入住老人信息
     * @return
     */
    @Override
    public List<RecOld> getAllOld() {
        return oldDao.getAllOld();
    }

    /**
     * 模糊查询
     * @param recOld
     * @return
     */
    @Override
    public List<RecOld> fazzySearchByOld(RecOld recOld) {
        List<RecOld> recOlds = oldDao.fazzySearchByOld(recOld);
        return recOlds;
    }

    @Override
    public long addOld(RecOld recOld) {
        oldDao.addOld(recOld);
        return recOld.getOldId();
    }

    @Override
    public RecOld getOldByOldId(long id) {
        RecOld oldByOldId = oldDao.getOldByOldId(id);
        return oldByOldId;
    }
}
