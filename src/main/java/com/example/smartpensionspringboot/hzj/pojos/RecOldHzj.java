package com.example.smartpensionspringboot.hzj.pojos;



import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RecOldHzj {

  private long oldId;
  private String oldName;
  private String identitycard;
  private String gender;
  private String phone;
  private String address;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date contractTime;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date joinTime;
  private String handle;
  private long archives;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date ctime;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date utime;
  @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
  private Date dtime;
  private long status;

  public RecOldHzj() {
  }

  public RecOldHzj(long oldId, String oldName, String identitycard, String gender, String phone, String address, Date contractTime, Date joinTime, String handle, long archives, Date ctime, Date utime, Date dtime, long status) {
    this.oldId = oldId;
    this.oldName = oldName;
    this.identitycard = identitycard;
    this.gender = gender;
    this.phone = phone;
    this.address = address;
    this.contractTime = contractTime;
    this.joinTime = joinTime;
    this.handle = handle;
    this.archives = archives;
    this.ctime = ctime;
    this.utime = utime;
    this.dtime = dtime;
    this.status = status;
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

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getContractTime() {
    return contractTime;
  }

  public void setContractTime(Date contractTime) {
    this.contractTime = contractTime;
  }

  public Date getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(Date joinTime) {
    this.joinTime = joinTime;
  }

  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public long getArchives() {
    return archives;
  }

  public void setArchives(long archives) {
    this.archives = archives;
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

  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }
}
