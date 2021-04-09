package com.example.smartpensionspringboot.yxj.service;

import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.example.smartpensionspringboot.yxj.mapper.DepositeMapper;
import com.example.smartpensionspringboot.yxj.pojos.Categorys;
import com.example.smartpensionspringboot.yxj.pojos.Deposite;
import com.example.smartpensionspringboot.yxj.pojos.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class DepositeService {
    @Autowired
    DepositeMapper depositeMapper;

    /**
     * 四表联查
     * @param a
     * @return
     */
    public List<Map<String,Object>> depositeList(String a){return depositeMapper.depositeList(a);}

    /**
     *  查询老人表
     * @return
     */
    public List<RecOld> recOldList(){return depositeMapper.oldList();}

    /**
     * 查询类别表
     * @return
     */
    public List<Categorys> categoryList(){return depositeMapper.categoryList();}

    /**
     * 查询药品类别表
     * @param categoryId
     * @return
     */
    public List<Drug> drcList(String categoryId){return depositeMapper.drcList(categoryId);}

    /**
     * 修改状态
     * @param Id
     */
    public void updatedeposite(Integer Id){
        depositeMapper.updatedeposite(Id);
    }


    /**
     * 新增缴存
     * @param deposite
     */
    public void savedeposite(Deposite deposite){
        deposite.getDrugList().forEach(d->{
            Deposite deposite1 =
                    new Deposite(deposite.getDepositeId(),deposite.getDepositeMode(),
                            d.getDeposite_num(),1,
                            deposite.getDepositeWarning(), new Date(),
                             d.getDrugId(),deposite.getRecOld());
            depositeMapper.savedeposite(deposite1);
        });
    }

}
