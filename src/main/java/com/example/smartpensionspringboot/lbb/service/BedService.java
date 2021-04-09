package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Bed;

public interface BedService {
    /**
     * 根据老人编号查找到床位
     */
    public Bed getBedByOldId(int id);

    /**
     * 根据床位号查找到床位
     * @param bed
     * @return
     */
    public Bed getBedByBed(String bed);

    /**
     * 新增床位
     */
    public void addBed(Bed bed);
}
