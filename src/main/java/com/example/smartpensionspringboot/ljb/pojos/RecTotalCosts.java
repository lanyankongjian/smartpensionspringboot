package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecTotalCosts {

  private Long totalCost;
  private Long resId;
  private Long bedId;
  private Long nursingId;
  private double feesPayable;
  private double reductionCost;
  private double discountCost;
  private double actualCost;
  private String payWay;
  private String remarks;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Long totalCost) {
    this.totalCost = totalCost;
  }


  public Long getResId() {
    return resId;
  }

  public void setResId(Long resId) {
    this.resId = resId;
  }


  public Long getBedId() {
    return bedId;
  }

  public void setBedId(Long bedId) {
    this.bedId = bedId;
  }


  public Long getNursingId() {
    return nursingId;
  }

  public void setNursingId(Long nursingId) {
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
