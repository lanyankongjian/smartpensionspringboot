package com.example.smartpensionspringboot.hzj.pojos;


public class RecHealthInformation {

  private long hiId;
  private long oldId;
  private String selfcare;
  private String vision;
  private String hearing;
  private String doctor;
  private String doctorPhone;
  private String allergy;
  private String medicalHistory;
  private String mainDiseases;
  private java.sql.Timestamp ctime;
  private java.sql.Timestamp utime;
  private java.sql.Timestamp dtime;


  public long getHiId() {
    return hiId;
  }

  public void setHiId(long hiId) {
    this.hiId = hiId;
  }


  public long getOldId() {
    return oldId;
  }

  public void setOldId(long oldId) {
    this.oldId = oldId;
  }


  public String getSelfcare() {
    return selfcare;
  }

  public void setSelfcare(String selfcare) {
    this.selfcare = selfcare;
  }


  public String getVision() {
    return vision;
  }

  public void setVision(String vision) {
    this.vision = vision;
  }


  public String getHearing() {
    return hearing;
  }

  public void setHearing(String hearing) {
    this.hearing = hearing;
  }


  public String getDoctor() {
    return doctor;
  }

  public void setDoctor(String doctor) {
    this.doctor = doctor;
  }


  public String getDoctorPhone() {
    return doctorPhone;
  }

  public void setDoctorPhone(String doctorPhone) {
    this.doctorPhone = doctorPhone;
  }


  public String getAllergy() {
    return allergy;
  }

  public void setAllergy(String allergy) {
    this.allergy = allergy;
  }


  public String getMedicalHistory() {
    return medicalHistory;
  }

  public void setMedicalHistory(String medicalHistory) {
    this.medicalHistory = medicalHistory;
  }


  public String getMainDiseases() {
    return mainDiseases;
  }

  public void setMainDiseases(String mainDiseases) {
    this.mainDiseases = mainDiseases;
  }


  public java.sql.Timestamp getCtime() {
    return ctime;
  }

  public void setCtime(java.sql.Timestamp ctime) {
    this.ctime = ctime;
  }


  public java.sql.Timestamp getUtime() {
    return utime;
  }

  public void setUtime(java.sql.Timestamp utime) {
    this.utime = utime;
  }


  public java.sql.Timestamp getDtime() {
    return dtime;
  }

  public void setDtime(java.sql.Timestamp dtime) {
    this.dtime = dtime;
  }

}
