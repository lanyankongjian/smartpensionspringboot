package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecNursing {

  private Long nursingId;
  private Long oldId;
  private String nursingLevel;
  private String levelExplain;
  private double nursingLevelCost;
  private double allNursingCost;
  private double customizedCost;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getNursingId() {
    return nursingId;
  }

  public void setNursingId(Long nursingId) {
    this.nursingId = nursingId;
  }


  public Long getOldId() {
    return oldId;
  }

  public void setOldId(Long oldId) {
    this.oldId = oldId;
  }


  public String getNursingLevel() {
    return nursingLevel;
  }

  public void setNursingLevel(String nursingLevel) {
    this.nursingLevel = nursingLevel;
  }


  public String getLevelExplain() {
    return levelExplain;
  }

  public void setLevelExplain(String levelExplain) {
    this.levelExplain = levelExplain;
  }


  public double getNursingLevelCost() {
    return nursingLevelCost;
  }

  public void setNursingLevelCost(double nursingLevelCost) {
    this.nursingLevelCost = nursingLevelCost;
  }


  public double getAllNursingCost() {
    return allNursingCost;
  }

  public void setAllNursingCost(double allNursingCost) {
    this.allNursingCost = allNursingCost;
  }


  public double getCustomizedCost() {
    return customizedCost;
  }

  public void setCustomizedCost(double customizedCost) {
    this.customizedCost = customizedCost;
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
