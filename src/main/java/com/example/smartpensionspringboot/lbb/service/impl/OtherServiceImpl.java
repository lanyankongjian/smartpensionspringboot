package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.CategoryDao;
import com.example.smartpensionspringboot.lbb.dao.OldDao;
import com.example.smartpensionspringboot.lbb.dao.OtherDao;
import com.example.smartpensionspringboot.lbb.dao.StreamDao;
import com.example.smartpensionspringboot.lbb.pojos.Category;
import com.example.smartpensionspringboot.lbb.pojos.Old;
import com.example.smartpensionspringboot.lbb.pojos.Other;
import com.example.smartpensionspringboot.lbb.pojos.Stream;
import com.example.smartpensionspringboot.lbb.service.OtherService;
import com.example.smartpensionspringboot.lbb.util.BeanCopyUtil;
import com.example.smartpensionspringboot.lbb.vo.OtherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OtherServiceImpl implements OtherService {
    @Autowired
    private OtherDao otherDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private OldDao oldDao;

    @Autowired
    private StreamDao streamDao;

    /**
     * 消费登记
     * @param vo
     */
    @Transactional
    @Override
    public void addOther(OtherVo vo) {
        //查找到类别
        Category category = categoryDao.getCategoryByName(vo.getCategory_name());
        //查找到老人
        Old old = oldDao.getOldByName(vo.getOld_name());

        Other other = new Other();
        vo.setOld_id(old.getOldId());
        vo.setCategory_id(category.getId());

        BeanCopyUtil.copyProperties(vo,other);
        //消费登记
        otherDao.addOther(other);
        //添加费用流水
        Stream stream = new Stream();
        stream.setOld_id(vo.getOld_id());
        stream.setCategory_id(vo.getCategory_id());
        stream.setMoney(vo.getMoney());
        stream.setManey_time(vo.getMoney_time());
        stream.setManey_text(vo.getCategory_name());
        streamDao.addStream(stream);
    }
}
