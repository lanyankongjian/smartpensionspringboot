package com.example.smartpensionspringboot.lbb.pojos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 押金
 */
@Data
public class Deposit {
    private Integer id;
    private Integer old_id;
    private BigDecimal margin;
    private int state;
    private Date get_time;
    private Date return_time;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
    private Old old;
}
