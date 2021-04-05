package com.example.smartpensionspringboot.cj.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

//健康管理--体检登记
@Component //将实体类，依赖注入，交给容器管理
public class ExpectedRegistration {
    private Integer regId;
    private Integer erOldName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date  updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date phyTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date regTime;
    private String registrant;
    private Integer registrantId;
    private String phyHospital;
    private String phyExamination;
    private String phyPicture;
    private BigDecimal height;
    private BigDecimal weight;
    private BigDecimal temperature;
    private BigDecimal highPressure;
    private BigDecimal lowPressure;
    private Integer pulse;
    private BigDecimal bloodOxygen;
    private BigDecimal fastingBlood;
    private BigDecimal postprandialBlood;
    private BigDecimal totalCholesterol;
    private BigDecimal hdl;
    private BigDecimal triglyceride;
    private BigDecimal ldl;
    private BigDecimal uricAcid;
    private String qrsInterval;
    private String rrInterval;
    private String gpComments;
    private String tdaResults;
    private Integer heartRate;
    private RecOld recOld;

    public RecOld getRecOld() {
        return recOld;
    }

    public void setRecOld(RecOld recOld) {
        this.recOld = recOld;
    }

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Integer getErOldName() {
        return erOldName;
    }

    public void setErOldName(Integer erOldName) {
        this.erOldName = erOldName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPhyTime() {
        return phyTime;
    }

    public void setPhyTime(Date phyTime) {
        this.phyTime = phyTime;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public Integer getRegistrantId() {
        return registrantId;
    }

    public void setRegistrantId(Integer registrantId) {
        this.registrantId = registrantId;
    }

    public String getPhyHospital() {
        return phyHospital;
    }

    public void setPhyHospital(String phyHospital) {
        this.phyHospital = phyHospital;
    }

    public String getPhyExamination() {
        return phyExamination;
    }

    public void setPhyExamination(String phyExamination) {
        this.phyExamination = phyExamination;
    }

    public String getPhyPicture() {
        return phyPicture;
    }

    public void setPhyPicture(String phyPicture) {
        this.phyPicture = phyPicture;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(BigDecimal highPressure) {
        this.highPressure = highPressure;
    }

    public BigDecimal getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(BigDecimal lowPressure) {
        this.lowPressure = lowPressure;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public BigDecimal getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(BigDecimal bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public BigDecimal getFastingBlood() {
        return fastingBlood;
    }

    public void setFastingBlood(BigDecimal fastingBlood) {
        this.fastingBlood = fastingBlood;
    }

    public BigDecimal getPostprandialBlood() {
        return postprandialBlood;
    }

    public void setPostprandialBlood(BigDecimal postprandialBlood) {
        this.postprandialBlood = postprandialBlood;
    }

    public BigDecimal getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(BigDecimal totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public BigDecimal getHdl() {
        return hdl;
    }

    public void setHdl(BigDecimal hdl) {
        this.hdl = hdl;
    }

    public BigDecimal getTriglyceride() {
        return triglyceride;
    }

    public void setTriglyceride(BigDecimal triglyceride) {
        this.triglyceride = triglyceride;
    }

    public BigDecimal getLdl() {
        return ldl;
    }

    public void setLdl(BigDecimal ldl) {
        this.ldl = ldl;
    }

    public BigDecimal getUricAcid() {
        return uricAcid;
    }

    public void setUricAcid(BigDecimal uricAcid) {
        this.uricAcid = uricAcid;
    }

    public String getQrsInterval() {
        return qrsInterval;
    }

    public void setQrsInterval(String qrsInterval) {
        this.qrsInterval = qrsInterval;
    }

    public String getRrInterval() {
        return rrInterval;
    }

    public void setRrInterval(String rrInterval) {
        this.rrInterval = rrInterval;
    }

    public String getGpComments() {
        return gpComments;
    }

    public void setGpComments(String gpComments) {
        this.gpComments = gpComments;
    }

    public String getTdaResults() {
        return tdaResults;
    }

    public void setTdaResults(String tdaResults) {
        this.tdaResults = tdaResults;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }
}
