package com.example.smartpensionspringboot.lbb.pojos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Other {
    private Integer id;
    private Integer old_id;
    private Integer category_id;
    private BigDecimal money;
    private Date money_time;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
    private Old old;
    private Category category;
}
