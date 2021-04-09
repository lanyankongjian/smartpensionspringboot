package com.example.smartpensionspringboot.ljb.vo;

import lombok.Data;

@Data
public class BedAndRestaurant {
    private Long oldId;         //老人id
    private Long bedId;
    private Long resId;
    private String bedType;     //床位类型
    private Boolean isroom;   //是否包房
    private String bed;     //床位编号
    private double cost;    //床位费用
    private String remarks; //床位备注
    private Long ddId;   //套餐编号
    private double packageFee; //套餐费用

}
