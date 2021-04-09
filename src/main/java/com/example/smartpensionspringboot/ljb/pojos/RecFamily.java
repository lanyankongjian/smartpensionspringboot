package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecFamily {

  private Long familyId;
  private Long oldId;
  private String familyname;
  private String phone;
  private String identitycard;
  private String relationship;
  private String gender;
  private String address;
  private Integer guardian;
  private Date ctime;
  private Date utime;
  private Date status;


  public Long getFamilyId() {
    return familyId;
  }

  public void setFamilyId(Long familyId) {
    this.familyId = familyId;
  }


  public Long getOldId() {
    return oldId;
  }

  public void setOldId(Long oldId) {
    this.oldId = oldId;
  }


  public String getFamilyname() {
    return familyname;
  }

  public void setFamilyname(String familyname) {
    this.familyname = familyname;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getIdentitycard() {
    return identitycard;
  }

  public void setIdentitycard(String identitycard) {
    this.identitycard = identitycard;
  }


  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Integer getGuardian() {
    return guardian;
  }

  public void setGuardian(Integer guardian) {
    this.guardian = guardian;
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


  public Date getStatus() {
    return status;
  }

  public void setStatus(Date status) {
    this.status = status;
  }

}
