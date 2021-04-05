package com.example.smartpensionspringboot.cj.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//评估管理--能力评估
public class CapacityAssessment {
    private Integer caId;
    private Date appraisalDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    private String evaluationReasons;
    private Integer oldName;
    private String provider;
    private String relation;
    private String contactName;
    private Integer contactNumber;

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public Date getAppraisalDate() {
        return appraisalDate;
    }

    public void setAppraisalDate(Date appraisalDate) {
        this.appraisalDate = appraisalDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEvaluationReasons() {
        return evaluationReasons;
    }

    public void setEvaluationReasons(String evaluationReasons) {
        this.evaluationReasons = evaluationReasons;
    }

    public Integer getOldName() {
        return oldName;
    }

    public void setOldName(Integer oldName) {
        this.oldName = oldName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }
}
