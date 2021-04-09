package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.PrestoreDao;
import com.example.smartpensionspringboot.lbb.exeception.GuliException;
import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.service.PrestoreService;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrestoreServiceImpl implements PrestoreService {
    @Autowired
    private PrestoreDao prestoreDao;

    /**
     * 多条件搜索预存
     * @param
     * @return
     */
    @Override
    public List<Prestore> getPrestoreBySearch(PrestoreVo vo) {
        return prestoreDao.getPrestoreBySearch(vo);
    }

    /**
     * 查看预存
     * @return
     */
    @Override
    public List<Prestore> getAllPrestore() {
        return prestoreDao.getAllPrestore();
    }


    /**
     * 查看某个老人的预存详情
     * @param id
     * @return
     */
    @Override
    public List<Prestore> getPrestoreByOldId(int id) {
        return prestoreDao.getPrestoreByOldId(id);
    }

    /**
     * 查看某个老人预存总余额
     * @param id
     * @return
     */
    /*@Override
    public Prestore getPrestoreById(int id) {
        return prestoreDao.getPrestoreById(id);
    }*/

    /**
     * 新增预存
     * @param prestore
     * @return
     */
    @Override
    public int addPrestore(Prestore prestore) {
        int i = prestoreDao.addPrestore(prestore);
        if (i > 0){
            return i;
        }else {
            throw new GuliException(201,"新增预存失败");
        }
    }

    /**
     * 修改预存
     * @param prestore
     */
    @Override
    public void updatePrestore(Prestore prestore) {
        prestoreDao.updatePrestore(prestore);
    }

    /**
     * 根据编号得到预存
     * @param id
     * @return
     */
    @Override
    public Prestore getPrestoreByPId(int id) {
        return prestoreDao.getPrestoreByPId(id);
    }
}
