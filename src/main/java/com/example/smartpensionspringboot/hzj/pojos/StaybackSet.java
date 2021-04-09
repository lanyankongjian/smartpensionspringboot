package com.example.smartpensionspringboot.hzj.pojos;


import java.sql.Date;

public class StaybackSet {

  private long ssId;
  private long oldId;
  private String oldName;
  private String identitycard;
  private String address;
  private String money;
  private Date joinTime;
  private Date endtime;
  private long status;

  public StaybackSet() {
  }

  public StaybackSet(long ssId, long oldId, String oldName, String identitycard, String address, String money, Date joinTime, Date endtime, long status) {
    this.ssId = ssId;
    this.oldId = oldId;
    this.oldName = oldName;
    this.identitycard = identitycard;
    this.address = address;
    this.money = money;
    this.joinTime = joinTime;
    this.endtime = endtime;
    this.status = status;
  }

  public long getSsId() {
    return ssId;
  }

  public void setSsId(long ssId) {
    this.ssId = ssId;
  }

  public long getOldId() {
    return oldId;
  }

  public void setOldId(long oldId) {
    this.oldId = oldId;
  }

  public String getOldName() {
    return oldName;
  }

  public void setOldName(String oldName) {
    this.oldName = oldName;
  }

  public String getIdentitycard() {
    return identitycard;
  }

  public void setIdentitycard(String identitycard) {
    this.identitycard = identitycard;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getMoney() {
    return money;
  }

  public void setMoney(String money) {
    this.money = money;
  }

  public Date getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(Date joinTime) {
    this.joinTime = joinTime;
  }

  public Date getEndtime() {
    return endtime;
  }

  public void setEndtime(Date endtime) {
    this.endtime = endtime;
  }

  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }
}
