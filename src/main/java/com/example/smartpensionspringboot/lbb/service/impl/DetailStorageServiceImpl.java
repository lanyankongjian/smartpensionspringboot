package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.DetailStorageDao;
import com.example.smartpensionspringboot.lbb.dao.OldDao;
import com.example.smartpensionspringboot.lbb.dao.PrestoreDao;
import com.example.smartpensionspringboot.lbb.exeception.GuliException;
import com.example.smartpensionspringboot.lbb.pojos.DetailStorage;
import com.example.smartpensionspringboot.lbb.pojos.Old;
import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.service.DetailStorageService;
import com.example.smartpensionspringboot.lbb.util.BeanCopyUtil;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Slf4j
public class DetailStorageServiceImpl implements DetailStorageService {
    @Autowired
    private DetailStorageDao detailStorageDao;

    @Autowired
    private OldDao oldDao;

    @Autowired
    private PrestoreDao prestoreDao;

    //查看预存详情
    @Override
    public List<DetailStorage> getDetailStorage() {
        return detailStorageDao.getDetailStorage();
    }

    //查看某个老人预存详情
    @Override
    public List<DetailStorage> getDetailStorageByOldId(int id) {

        return detailStorageDao.getDetailStorageByOldId(id);
    }

    @Transactional
    @Override
    public int addDetailStorage(PrestoreVo vo) {
        log.info(vo.toString());
        //根据名称查询出老人
        Old old = oldDao.getOldByName(vo.getOld_name());
        DetailStorage detailStorage = new DetailStorage();
        BeanCopyUtil.copyProperties(vo,detailStorage);
        //添加预存详情
        int i = detailStorageDao.addDetailStorage(detailStorage);

        if (i > 0){
            //添加预存
            Prestore prestore = new Prestore();
            prestore.setOld_id(old.getOldId());
            prestore.setDetail_id(detailStorage.getId());

            int r = prestoreDao.addPrestore(prestore);
            if (r > 0){
                return r;
            }else {
                throw new GuliException(201,"新增预存失败");
            }
        }else {
            throw new GuliException(201,"新增预存详情失败");
        }
    }
}
