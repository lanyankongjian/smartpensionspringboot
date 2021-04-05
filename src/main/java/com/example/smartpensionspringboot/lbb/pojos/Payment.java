package com.example.smartpensionspringboot.lbb.pojos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 交费登记
 */
@Data
public class Payment {
    private Integer id;
    private Integer old_id;
    private String payer;
    private BigDecimal amount;
    private Date amount_time;
    private int style;
    private int state;
    private String registrant;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
    private Old old;
}
