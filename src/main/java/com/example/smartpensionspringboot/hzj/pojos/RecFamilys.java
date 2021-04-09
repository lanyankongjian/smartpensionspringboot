package com.example.smartpensionspringboot.hzj.pojos;

import java.sql.Timestamp;

/**
 * 家属信息实体
 */
public class RecFamilys {

  private long familyId;
  private long oldId;
  private String familyname;
  private String phone;
  private String identitycard;
  private String relationship;
  private String gender;
  private String address;
  private long guardian;
  private Timestamp ctime;
  private Timestamp utime;
  private Timestamp status;

  public RecFamilys() {
  }

  public RecFamilys(long familyId, long oldId, String familyname, String phone, String identitycard, String relationship, String gender, String address, long guardian, Timestamp ctime, Timestamp utime, Timestamp status) {
    this.familyId = familyId;
    this.oldId = oldId;
    this.familyname = familyname;
    this.phone = phone;
    this.identitycard = identitycard;
    this.relationship = relationship;
    this.gender = gender;
    this.address = address;
    this.guardian = guardian;
    this.ctime = ctime;
    this.utime = utime;
    this.status = status;
  }

  public long getFamilyId() {
    return familyId;
  }

  public void setFamilyId(long familyId) {
    this.familyId = familyId;
  }


  public long getOldId() {
    return oldId;
  }

  public void setOldId(long oldId) {
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


  public long getGuardian() {
    return guardian;
  }

  public void setGuardian(long guardian) {
    this.guardian = guardian;
  }


  public Timestamp getCtime() {
    return ctime;
  }

  public void setCtime(Timestamp ctime) {
    this.ctime = ctime;
  }


  public Timestamp getUtime() {
    return utime;
  }

  public void setUtime(Timestamp utime) {
    this.utime = utime;
  }


  public Timestamp getStatus() {
    return status;
  }

  public void setStatus(Timestamp status) {
    this.status = status;
  }

}
