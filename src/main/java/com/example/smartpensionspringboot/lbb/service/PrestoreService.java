package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Prestore;
import com.example.smartpensionspringboot.lbb.vo.PrestoreVo;

import java.util.List;

public interface PrestoreService {
 /**
  * 多条件搜索预存
  * @param vo
  * @return
  */
 public List<Prestore> getPrestoreBySearch(PrestoreVo vo);

    /**
     * 查看预存信息
     * @return
     */
    public List<Prestore> getAllPrestore();

    /**
     * 查看某个老人的预存详情
     * @param id
     * @return
     */
    public List<Prestore> getPrestoreByOldId(int id);

    /*根据老人编号得到预存总金额
    public Prestore getPrestoreById(int id);*/

    /**
     * 新增预存
     */
    public int addPrestore(Prestore prestore);

    /**
     * 修改预存
     */
    public void updatePrestore(Prestore prestore);

    /**
     * 根据编号得到预存
     */
    public Prestore getPrestoreByPId(int id);
}
