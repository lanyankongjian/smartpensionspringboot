package com.example.smartpensionspringboot.hzj.pojos;
public class RecTotalCost {

  private long totalCost;
  private long resId;
  private long bedId;
  private long nursingId;
  private double feesPayable;
  private double reductionCost;
  private double discountCost;
  private double actualCost;
  private String payWay;
  private String remarks;
  private java.sql.Timestamp ctime;
  private java.sql.Timestamp utime;
  private java.sql.Timestamp dtime;


  public long getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(long totalCost) {
    this.totalCost = totalCost;
  }


  public long getResId() {
    return resId;
  }

  public void setResId(long resId) {
    this.resId = resId;
  }


  public long getBedId() {
    return bedId;
  }

  public void setBedId(long bedId) {
    this.bedId = bedId;
  }


  public long getNursingId() {
    return nursingId;
  }

  public void setNursingId(long nursingId) {
    this.nursingId = nursingId;
  }


  public double getFeesPayable() {
    return feesPayable;
  }

  public void setFeesPayable(double feesPayable) {
    this.feesPayable = feesPayable;
  }


  public double getReductionCost() {
    return reductionCost;
  }

  public void setReductionCost(double reductionCost) {
    this.reductionCost = reductionCost;
  }


  public double getDiscountCost() {
    return discountCost;
  }

  public void setDiscountCost(double discountCost) {
    this.discountCost = discountCost;
  }


  public double getActualCost() {
    return actualCost;
  }

  public void setActualCost(double actualCost) {
    this.actualCost = actualCost;
  }


  public String getPayWay() {
    return payWay;
  }

  public void setPayWay(String payWay) {
    this.payWay = payWay;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public java.sql.Timestamp getCtime() {
    return ctime;
  }

  public void setCtime(java.sql.Timestamp ctime) {
    this.ctime = ctime;
  }


  public java.sql.Timestamp getUtime() {
    return utime;
  }

  public void setUtime(java.sql.Timestamp utime) {
    this.utime = utime;
  }


  public java.sql.Timestamp getDtime() {
    return dtime;
  }

  public void setDtime(java.sql.Timestamp dtime) {
    this.dtime = dtime;
  }

}
