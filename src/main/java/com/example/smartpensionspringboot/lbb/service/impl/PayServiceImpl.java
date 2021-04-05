package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.PayDao;
import com.example.smartpensionspringboot.lbb.pojos.Pay;
import com.example.smartpensionspringboot.lbb.service.PayService;
import com.example.smartpensionspringboot.lbb.util.BeanCopyUtil;
import com.example.smartpensionspringboot.lbb.vo.PayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = false)
public class PayServiceImpl implements PayService {
    @Autowired
    private PayDao payDao;

    @Override
    public void addPay(PayVo vo) {
        Pay pay = new Pay();
        BeanCopyUtil.copyProperties(vo,pay);
        payDao.addPay(pay);
    }

    @Override
    public List<Pay> getPay() {
        return payDao.getPay();
    }
}
