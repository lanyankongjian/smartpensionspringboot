package com.example.smartpensionspringboot.cj.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//评估管理--评估登记
public class AssessmentRegistration {
    private Integer arId;
    private Integer arOldName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date evaluationDate;
    private String assessmentType;
    private String assessor;
    private String assessmentLocation;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registrationTime;
    private String registrant;
    private String assessmentResults;
    private RecOld recOld;

    public RecOld getRecOld() {
        return recOld;
    }

    public void setRecOld(RecOld recOld) {
        this.recOld = recOld;
    }

    public Integer getArId() {
        return arId;
    }

    public void setArId(Integer arId) {
        this.arId = arId;
    }

    public Integer getArOldName() {
        return arOldName;
    }

    public void setArOldName(Integer arOldName) {
        this.arOldName = arOldName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    public String getAssessor() {
        return assessor;
    }

    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }

    public String getAssessmentLocation() {
        return assessmentLocation;
    }

    public void setAssessmentLocation(String assessmentLocation) {
        this.assessmentLocation = assessmentLocation;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public String getAssessmentResults() {
        return assessmentResults;
    }

    public void setAssessmentResults(String assessmentResults) {
        this.assessmentResults = assessmentResults;
    }
}
