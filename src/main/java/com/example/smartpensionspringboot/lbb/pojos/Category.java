package com.example.smartpensionspringboot.lbb.pojos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 费用类别
 */
@Data
public class Category {
    private Integer id;
    private String category_name;
    private String cost_text;
    private BigDecimal fees;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
}
