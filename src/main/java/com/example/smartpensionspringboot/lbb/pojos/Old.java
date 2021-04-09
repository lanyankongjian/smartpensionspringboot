package com.example.smartpensionspringboot.lbb.pojos;


import java.util.Date;

public class Old {
  private Integer oldId;
  private String oldName;
  private String identitycard;
  private String gender;
  private String phone;
  private String address;
  private Date contractTime;
  private Date joinTime;
  private String handle;
  private Long archives;
  private Date ctime;
  private Date utime;
  private Date dtime;
  private Long status;

  public Old() {
  }

  public Old(Integer oldId, String oldName, String identitycard, String gender, String phone, String address, Date contractTime, Date joinTime, String handle, Long archives, Date ctime, Date utime, Date dtime, Long status) {
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

  public Integer getOldId() {
    return oldId;
  }

  public void setOldId(Integer oldId) {
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

  @Override
  public String toString() {
    return "Old{" +
            "oldId=" + oldId +
            ", oldName='" + oldName + '\'' +
            ", identitycard='" + identitycard + '\'' +
            ", gender='" + gender + '\'' +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", contractTime=" + contractTime +
            ", joinTime=" + joinTime +
            ", handle='" + handle + '\'' +
            ", archives=" + archives +
            ", ctime=" + ctime +
            ", utime=" + utime +
            ", dtime=" + dtime +
            ", status=" + status +
            '}';
  }
}
