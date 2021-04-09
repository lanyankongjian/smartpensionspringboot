package com.example.smartpensionspringboot.ljb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class RecAsk {

  private Long askId;
  private String askName;
  private String relationship;
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
  private Date askDate;
  private String phone;
  private String askWay;
  private String askType;
  private String receiver;
  private String askCentent;
  private Date ctime;
  private Date utime;
  private Date dtime;


  public Long getAskId() {
    return askId;
  }

  public void setAskId(Long askId) {
    this.askId = askId;
  }


  public String getAskName() {
    return askName;
  }

  public void setAskName(String askName) {
    this.askName = askName;
  }


  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  public Date getAskDate() {
    return askDate;
  }

  public void setAskDate(Date askDate) {
    this.askDate = askDate;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAskWay() {
    return askWay;
  }

  public void setAskWay(String askWay) {
    this.askWay = askWay;
  }


  public String getAskType() {
    return askType;
  }

  public void setAskType(String askType) {
    this.askType = askType;
  }


  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public String getAskCentent() {
    return askCentent;
  }

  public void setAskCentent(String askCentent) {
    this.askCentent = askCentent;
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

  @Override
  public String toString() {
    return "RecAsk{" +
            "askId=" + askId +
            ", askName='" + askName + '\'' +
            ", relationship='" + relationship + '\'' +
            ", askDate=" + askDate +
            ", phone='" + phone + '\'' +
            ", askWay='" + askWay + '\'' +
            ", askType='" + askType + '\'' +
            ", receiver='" + receiver + '\'' +
            ", askCentent='" + askCentent + '\'' +
            ", ctime=" + ctime +
            ", utime=" + utime +
            ", dtime=" + dtime +
            '}';
  }
}
