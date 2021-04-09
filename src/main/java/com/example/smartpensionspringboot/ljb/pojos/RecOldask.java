package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecOldask {

  private Long oldaskId;
  private String oldaskName;
  private Long askId;
  private String identtitycard;
  private String gender;
  private String selfcare;
  private String address;
  private Long status;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getOldaskId() {
    return oldaskId;
  }

  public void setOldaskId(Long oldaskId) {
    this.oldaskId = oldaskId;
  }


  public String getOldaskName() {
    return oldaskName;
  }

  public void setOldaskName(String oldaskName) {
    this.oldaskName = oldaskName;
  }


  public Long getAskId() {
    return askId;
  }

  public void setAskId(Long askId) {
    this.askId = askId;
  }


  public String getIdenttitycard() {
    return identtitycard;
  }

  public void setIdenttitycard(String identtitycard) {
    this.identtitycard = identtitycard;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getSelfcare() {
    return selfcare;
  }

  public void setSelfcare(String selfcare) {
    this.selfcare = selfcare;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
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
