package com.example.smartpensionspringboot.yxj.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DepositeVo {
   private String recOld;
   @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
   private Date depositeTime;
   private String depositeMode;
   private String drugName;
   private Integer depositeNum;
   private String drugSize;
   private Integer depositeZt;


}
