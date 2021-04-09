package com.example.smartpensionspringboot.lbb.pojos;


import java.util.Date;

public class Bed {
  private Integer bedId;
  private Integer oldId;
  private String bedType;
  private Boolean isroom;
  private String bed;
  private double cost;
  private String remarks;
  private Date ctime;
  private Date utime;
  private Date dtime;

  public Bed() {
  }

  public Bed(Integer bedId, Integer oldId, String bedType, Boolean isroom, String bed, double cost, String remarks, Date ctime, Date utime, Date dtime) {
    this.bedId = bedId;
    this.oldId = oldId;
    this.bedType = bedType;
    this.isroom = isroom;
    this.bed = bed;
    this.cost = cost;
    this.remarks = remarks;
    this.ctime = ctime;
    this.utime = utime;
    this.dtime = dtime;
  }

  public Integer getBedId() {
    return bedId;
  }

  public void setBedId(Integer bedId) {
    this.bedId = bedId;
  }

  public Integer getOldId() {
    return oldId;
  }

  public void setOldId(Integer oldId) {
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

  @Override
  public String toString() {
    return "Bed{" +
            "bedId=" + bedId +
            ", oldId=" + oldId +
            ", bedType='" + bedType + '\'' +
            ", isroom=" + isroom +
            ", bed='" + bed + '\'' +
            ", cost=" + cost +
            ", remarks='" + remarks + '\'' +
            ", ctime=" + ctime +
            ", utime=" + utime +
            ", dtime=" + dtime +
            '}';
  }
}
