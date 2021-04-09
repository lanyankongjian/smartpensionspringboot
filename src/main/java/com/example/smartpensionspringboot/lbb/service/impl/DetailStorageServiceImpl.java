package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.*;
import com.example.smartpensionspringboot.lbb.exeception.GuliException;
import com.example.smartpensionspringboot.lbb.pojos.*;
import com.example.smartpensionspringboot.lbb.service.DetailStorageService;
import com.example.smartpensionspringboot.lbb.util.BeanCopyUtil;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
public class DetailStorageServiceImpl implements DetailStorageService {
    @Autowired
    private DetailStorageDao detailStorageDao;

    @Autowired
    private OldsDao oldsDao;

    @Autowired
    private PrestoreDao prestoreDao;

    @Autowired
    private BedsDao bedsDao;

    @Autowired
    private PaymentDao paymentDao;

    @Autowired
    private StreamDao streamDao;

    @Autowired
    private CategoryDao categoryDao;

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

    /**
     * 新增预存详情
     * @param vo
     * @return
     */
    @Transactional
    @Override
    public int addDetailStorage(PrestoreVo vo) {
        //根据名称查询出老人
        Old old = oldsDao.getOldByName(vo.getOld_name());

        DetailStorage detailStorage = new DetailStorage();
        BeanCopyUtil.copyProperties(vo,detailStorage);
        //添加预存详情
        detailStorage.setAmount(vo.getMoney());
        detailStorage.setPayment(vo.getPayment());
        detailStorage.setCharging_time(vo.getCharging_time());
        detailStorage.setTollman(vo.getTollman());
        detailStorage.setDexplain("费用预存");
        int i = detailStorageDao.addDetailStorage(detailStorage);

        if (i > 0){
            //添加预存
            Prestore prestore = new Prestore();
            prestore.setOld_id(old.getOldId());
            prestore.setDetail_id(detailStorage.getId());
            prestore.setAmount(vo.getAmount().add(vo.getMoney()));
            int r = prestoreDao.addPrestore(prestore);

            //交费登记
            Payment payment = new Payment();
            payment.setOld_id(old.getOldId());
            payment.setPayer(vo.getPayer());
            payment.setAmount(vo.getMoney());
            payment.setAmount_time(vo.getCharging_time());
            payment.setRegistrant(vo.getTollman());
            payment.setRemark(vo.getRemark());
            paymentDao.addPayment(payment);

            //费用流水
            Category category = categoryDao.getCategoryByName("入住预存");
            Stream stream = new Stream();
            stream.setOld_id(old.getOldId());
            stream.setTollman(vo.getTollman());
            stream.setCategory_id(category.getId());
            stream.setMoney(vo.getMoney());
            stream.setManey_time(vo.getCharging_time());
            stream.setManey_text("入住预存");
            streamDao.addStream(stream);
            if (r > 0){
                return r;
            }else {
                throw new GuliException(201,"新增预存失败");
            }

        }else {
            throw new GuliException(201,"新增预存详情失败");
        }
    }

    /**
     * 获取某个老人预存总余额
     * @param vo
     */
    @Override
    public BigDecimal getOldAmountById(PrestoreVo vo) {
        //根据名称得到老人
        Old old = oldsDao.getOldByName(vo.getOld_name());
        //得到老人的预存详情
        List<DetailStorage> list = detailStorageDao.getDetailStorageByOldId(old.getOldId());
        BigDecimal amount = new BigDecimal("0.00");
        if (list.size() != 0){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAmount() != null){
                    amount = amount.add(list.get(i).getAmount());
                }
            }
        }
        return amount;
    }
}
