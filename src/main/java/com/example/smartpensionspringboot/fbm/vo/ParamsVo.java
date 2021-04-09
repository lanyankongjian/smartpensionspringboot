package com.example.smartpensionspringboot.fbm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

//import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamsVo {
    private Integer id;

    private Integer number;

    private String category;
    //名称
    private String name;
    //创建人
    private String founder;
    //当前页码
    private Integer page = 1;
    //每页条数
    private Integer limit = 5;
    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startingTime;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    //最小金额
    private BigDecimal minimumAmount;
    //最大金额
    private BigDecimal maximumAmount;


    private Integer[] ids;
    private String[] names;
}
