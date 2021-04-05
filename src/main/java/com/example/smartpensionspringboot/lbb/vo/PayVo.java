package com.example.smartpensionspringboot.lbb.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class PayVo {
    private Integer old_id;
    private String tollman;
    private String payer;
    private BigDecimal amount;
    private Date amount_time;
    private int pay_style;
    private String remark;
}
