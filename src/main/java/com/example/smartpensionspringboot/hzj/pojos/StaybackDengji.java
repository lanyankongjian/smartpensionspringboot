package com.example.smartpensionspringboot.hzj.pojos;


import java.sql.Date;

public class StaybackDengji {

  private long dengjiId;
  private int oldid;
  private String oldName;
  private String identitycard;
  private Date endtime;
  private String outof;
  private String dengjiren;
  private String cause;
  private Date joinTime;

  public StaybackDengji() {
  }

  public long getDengjiId() {
    return dengjiId;
  }

  public void setDengjiId(long dengjiId) {
    this.dengjiId = dengjiId;
  }

  public int getOldid() {
    return oldid;
  }

  public void setOldid(int oldid) {
    this.oldid = oldid;
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

  public Date getEndtime() {
    return endtime;
  }

  public void setEndtime(Date endtime) {
    this.endtime = endtime;
  }

  public String getOutof() {
    return outof;
  }

  public void setOutof(String outof) {
    this.outof = outof;
  }

  public String getDengjiren() {
    return dengjiren;
  }

  public void setDengjiren(String dengjiren) {
    this.dengjiren = dengjiren;
  }

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public Date getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(Date joinTime) {
    this.joinTime = joinTime;
  }

  public StaybackDengji(long dengjiId, int oldid, String oldName, String identitycard, Date endtime, String outof, String dengjiren, String cause, Date joinTime) {
    this.dengjiId = dengjiId;
    this.oldid = oldid;
    this.oldName = oldName;
    this.identitycard = identitycard;
    this.endtime = endtime;
    this.outof = outof;
    this.dengjiren = dengjiren;
    this.cause = cause;
    this.joinTime = joinTime;
  }
}
