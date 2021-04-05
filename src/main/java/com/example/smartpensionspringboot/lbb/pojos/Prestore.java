package com.example.smartpensionspringboot.lbb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 预存管理
 */
@Data
public class Prestore {
    private Integer id;
    private Integer old_id;
    private Integer detail_id;
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date insert_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date delete_time;
    private Old old;
    private DetailStorage detailStorage;
}
