package com.example.smartpensionspringboot.lbb.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OtherVo {
    private Integer id;
    private Integer old_id;
    private String old_name;
    private Integer category_id;
    private String category_name;
    private BigDecimal money;
    private Date money_time;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
}
