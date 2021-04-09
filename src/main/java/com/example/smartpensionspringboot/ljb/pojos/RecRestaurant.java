package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecRestaurant {

  private Long resId;
  private Long oldId;
  private Long ddId;
  private double packageFee;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getResId() {
    return resId;
  }

  public void setResId(Long resId) {
    this.resId = resId;
  }


  public Long getOldId() {
    return oldId;
  }

  public void setOldId(Long oldId) {
    this.oldId = oldId;
  }


  public Long getDdId() {
    return ddId;
  }

  public void setDdId(Long ddId) {
    this.ddId = ddId;
  }

  public double getPackageFee() {
    return packageFee;
  }

  public void setPackageFee(double packageFee) {
    this.packageFee = packageFee;
  }


  public Date getCtime() {
    return ctime;
  }

  public void setCtime(Date ctime) {
    this.ctime = ctime;
  }


  public Date getUtime() {
    return utime;
  }

  public void setUtime(Date utime) {
    this.utime = utime;
  }


  public Date getDtime() {
    return dtime;
  }

  public void setDtime(Date dtime) {
    this.dtime = dtime;
  }

}
