package com.example.smartpensionspringboot.cj.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//健康管理--就医登记
public class MedicalRegistration {
    private Integer mrId;
    private Integer mrOldName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date medicalTime;
    private String physician;
    private String placeOfMedical;
    private String diagnosisResults;
    private String medicalAdvice;
    private RecOld recOld;

    public RecOld getRecOld() {
        return recOld;
    }

    public void setRecOld(RecOld recOld) {
        this.recOld = recOld;
    }

    public Integer getMrId() {
        return mrId;
    }

    public void setMrId(Integer mrId) {
        this.mrId = mrId;
    }

    public Integer getMrOldName() {
        return mrOldName;
    }

    public void setMrOldName(Integer mrOldName) {
        this.mrOldName = mrOldName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getMedicalTime() {
        return medicalTime;
    }

    public void setMedicalTime(Date medicalTime) {
        this.medicalTime = medicalTime;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getPlaceOfMedical() {
        return placeOfMedical;
    }

    public void setPlaceOfMedical(String placeOfMedical) {
        this.placeOfMedical = placeOfMedical;
    }

    public String getDiagnosisResults() {
        return diagnosisResults;
    }

    public void setDiagnosisResults(String diagnosisResults) {
        this.diagnosisResults = diagnosisResults;
    }

    public String getMedicalAdvice() {
        return medicalAdvice;
    }

    public void setMedicalAdvice(String medicalAdvice) {
        this.medicalAdvice = medicalAdvice;
    }
}
