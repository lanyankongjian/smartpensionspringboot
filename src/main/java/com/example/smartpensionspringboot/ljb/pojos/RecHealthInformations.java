package com.example.smartpensionspringboot.ljb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class RecHealthInformations {

  private Long hiId;
  private Long oldId;
  private String selfcare;
  private String vision;
  private String hospital;
  private String hearing;
  private String doctor;
  private String doctorPhone;
  private String allergy;
  private String medicalHistory;
  private String mainDiseases;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getHiId() {
    return hiId;
  }

  public void setHiId(Long hiId) {
    this.hiId = hiId;
  }


  public Long getOldId() {
    return oldId;
  }

  public void setOldId(Long oldId) {
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
