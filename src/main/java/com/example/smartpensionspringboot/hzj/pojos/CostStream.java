package com.example.smartpensionspringboot.hzj.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class CostStream {

  private long id;
  private long oldId;
  private long categoryId;
  private double money;
  private String tollman;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date maneyTime;
  private String maneyText;
  private String remark;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date insertTime;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date updateTime;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date deleteTime;

  public CostStream() {
  }

  public CostStream(long id, long oldId, long categoryId, double money, String tollman, Date maneyTime, String maneyText, String remark, Date insertTime, Date updateTime, Date deleteTime) {
    this.id = id;
    this.oldId = oldId;
    this.categoryId = categoryId;
    this.money = money;
    this.tollman = tollman;
    this.maneyTime = maneyTime;
    this.maneyText = maneyText;
    this.remark = remark;
    this.insertTime = insertTime;
    this.updateTime = updateTime;
    this.deleteTime = deleteTime;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOldId() {
    return oldId;
  }

  public void setOldId(long oldId) {
    this.oldId = oldId;
  }

  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public String getTollman() {
    return tollman;
  }

  public void setTollman(String tollman) {
    this.tollman = tollman;
  }

  public Date getManeyTime() {
    return maneyTime;
  }

  public void setManeyTime(Date maneyTime) {
    this.maneyTime = maneyTime;
  }

  public String getManeyText() {
    return maneyText;
  }

  public void setManeyText(String maneyText) {
    this.maneyText = maneyText;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Date getInsertTime() {
    return insertTime;
  }

  public void setInsertTime(Date insertTime) {
    this.insertTime = insertTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Date getDeleteTime() {
    return deleteTime;
  }

  public void setDeleteTime(Date deleteTime) {
    this.deleteTime = deleteTime;
  }
}
