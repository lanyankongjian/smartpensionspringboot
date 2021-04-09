package com.example.smartpensionspringboot.ljb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class RecOld2 {

  private Long oldId;
  private String oldName;
  private String identitycard;
  private String gender;
  private String phone;
  private String address;
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
  private Date contractTime;
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
  private Date joinTime;
  private String handle;
  private Long archives;
  private Date ctime;
  private Date utime;
  private Date dtime;
  private Long status;


  public Long getOldId() {
    return oldId;
  }

  public void setOldId(Long oldId) {
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


  public Long getArchives() {
    return archives;
  }

  public void setArchives(Long archives) {
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


  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

}
