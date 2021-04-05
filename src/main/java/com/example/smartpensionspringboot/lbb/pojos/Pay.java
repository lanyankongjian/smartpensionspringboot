package com.example.smartpensionspringboot.lbb.pojos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 入住交费
 */
@Data
public class Pay {
    private Integer id;
    private Integer old_id;
    private String tollman;
    private String payer;
    private BigDecimal amount;
    private Date amount_time;
    private int pay_style;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
    private Old old;
}
