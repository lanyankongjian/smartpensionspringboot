package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecBed {

  private Long bedId;
  private Long oldId;
  private String bedType;
  private Boolean isroom;
  private String bed;
  private double cost;
  private String remarks;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getBedId() {
    return bedId;
  }

  public void setBedId(Long bedId) {
    this.bedId = bedId;
  }


  public Long getOldId() {
    return oldId;
  }

  public void setOldId(Long oldId) {
    this.oldId = oldId;
  }


  public String getBedType() {
    return bedType;
  }

  public void setBedType(String bedType) {
    this.bedType = bedType;
  }


  public Boolean getIsroom() {
    return isroom;
  }

  public void setIsroom(Boolean isroom) {
    this.isroom = isroom;
  }


  public String getBed() {
    return bed;
  }

  public void setBed(String bed) {
    this.bed = bed;
  }


  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
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
