package com.example.smartpensionspringboot.hzj.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class OldDananVo {
    //老人信息表
    private long oldId;
    private String oldName;
    private String identitycard;
    private String gender;
    private String phone;
    private String address;
    private long archives;
    private long status;

    //体检信息表
    @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
    private Date phyTime;
    @JsonFormat(pattern ="yyyy-MM-dd" ,timezone = "GMT+8")
    private Date regTime;
    private String registrant;
    private long registrantId;
    private String phyHospital;
    private String phyExamination;
    private String phyPicture;
    private double height;
    private double weight;
    private double temperature;
    private double highPressure;
    private double lowPressure;
    private long pulse;
    private double bloodOxygen;
    private double fastingBlood;
    private double postprandialBlood;
    private double totalCholesterol;
    private double hdl;
    private double triglyceride;
    private double ldl;
    private double uricAcid;
    private String qrsInterval;
    private String rrInterval;
    private String gpComments;
    private String tdaResults;
    private long heartRate;

    //家属信息表
    private String familyname;
    private String phones;
    private String identitycards;
    private String relationship;
    private String genders;
    private String addresss;
    private long guardian;

    //健康信息表
    private String selfcare;
    private String vision;
    private String hearing;
    private String doctor;
    private String doctorPhone;
    private String allergy;
    private String medicalHistory;
    private String mainDiseases;

    @Override
    public String toString() {
        return "OldDananVo{" +
                "oldId=" + oldId +
                ", oldName='" + oldName + '\'' +
                ", identitycard='" + identitycard + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", archives=" + archives +
                ", status=" + status +
                ", updateTime=" + updateTime +
                ", phyTime=" + phyTime +
                ", regTime=" + regTime +
                ", registrant='" + registrant + '\'' +
                ", registrantId=" + registrantId +
                ", phyHospital='" + phyHospital + '\'' +
                ", phyExamination='" + phyExamination + '\'' +
                ", phyPicture='" + phyPicture + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", temperature=" + temperature +
                ", highPressure=" + highPressure +
                ", lowPressure=" + lowPressure +
                ", pulse=" + pulse +
                ", bloodOxygen=" + bloodOxygen +
                ", fastingBlood=" + fastingBlood +
                ", postprandialBlood=" + postprandialBlood +
                ", totalCholesterol=" + totalCholesterol +
                ", hdl=" + hdl +
                ", triglyceride=" + triglyceride +
                ", ldl=" + ldl +
                ", uricAcid=" + uricAcid +
                ", qrsInterval='" + qrsInterval + '\'' +
                ", rrInterval='" + rrInterval + '\'' +
                ", gpComments='" + gpComments + '\'' +
                ", tdaResults='" + tdaResults + '\'' +
                ", heartRate=" + heartRate +
                ", familyname='" + familyname + '\'' +
                ", phones='" + phones + '\'' +
                ", identitycards='" + identitycards + '\'' +
                ", relationship='" + relationship + '\'' +
                ", genders='" + genders + '\'' +
                ", addresss='" + addresss + '\'' +
                ", guardian=" + guardian +
                ", selfcare='" + selfcare + '\'' +
                ", vision='" + vision + '\'' +
                ", hearing='" + hearing + '\'' +
                ", doctor='" + doctor + '\'' +
                ", doctorPhone='" + doctorPhone + '\'' +
                ", allergy='" + allergy + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", mainDiseases='" + mainDiseases + '\'' +
                '}';
    }

    public OldDananVo() {
    }

    public OldDananVo(long oldId,String oldName, String identitycard, String gender, String phone, String address, long archives, long status, Timestamp updateTime, Timestamp phyTime, Timestamp regTime, String registrant, long registrantId, String phyHospital, String phyExamination, String phyPicture, double height, double weight, double temperature, double highPressure, double lowPressure, long pulse, double bloodOxygen, double fastingBlood, double postprandialBlood, double totalCholesterol, double hdl, double triglyceride, double ldl, double uricAcid, String qrsInterval, String rrInterval, String gpComments, String tdaResults, long heartRate, String familyname, String phones, String identitycards, String relationship, String genders, String addresss, long guardian, String selfcare, String vision, String hearing, String doctor, String doctorPhone, String allergy, String medicalHistory, String mainDiseases) {
        this.oldId = oldId;
        this.oldName = oldName;
        this.identitycard = identitycard;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.archives = archives;
        this.status = status;
        this.updateTime = updateTime;
        this.phyTime = phyTime;
        this.regTime = regTime;
        this.registrant = registrant;
        this.registrantId = registrantId;
        this.phyHospital = phyHospital;
        this.phyExamination = phyExamination;
        this.phyPicture = phyPicture;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.highPressure = highPressure;
        this.lowPressure = lowPressure;
        this.pulse = pulse;
        this.bloodOxygen = bloodOxygen;
        this.fastingBlood = fastingBlood;
        this.postprandialBlood = postprandialBlood;
        this.totalCholesterol = totalCholesterol;
        this.hdl = hdl;
        this.triglyceride = triglyceride;
        this.ldl = ldl;
        this.uricAcid = uricAcid;
        this.qrsInterval = qrsInterval;
        this.rrInterval = rrInterval;
        this.gpComments = gpComments;
        this.tdaResults = tdaResults;
        this.heartRate = heartRate;
        this.familyname = familyname;
        this.phones = phones;
        this.identitycards = identitycards;
        this.relationship = relationship;
        this.genders = genders;
        this.addresss = addresss;
        this.guardian = guardian;
        this.selfcare = selfcare;
        this.vision = vision;
        this.hearing = hearing;
        this.doctor = doctor;
        this.doctorPhone = doctorPhone;
        this.allergy = allergy;
        this.medicalHistory = medicalHistory;
        this.mainDiseases = mainDiseases;
    }

    public long getOldId() {
        return oldId;
    }

    public void setOldId(long oldId) {
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

    public long getArchives() {
        return archives;
    }

    public void setArchives(long archives) {
        this.archives = archives;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPhyTime() {
        return phyTime;
    }

    public void setPhyTime(Timestamp phyTime) {
        this.phyTime = phyTime;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public long getRegistrantId() {
        return registrantId;
    }

    public void setRegistrantId(long registrantId) {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(double highPressure) {
        this.highPressure = highPressure;
    }

    public double getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(double lowPressure) {
        this.lowPressure = lowPressure;
    }

    public long getPulse() {
        return pulse;
    }

    public void setPulse(long pulse) {
        this.pulse = pulse;
    }

    public double getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(double bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public double getFastingBlood() {
        return fastingBlood;
    }

    public void setFastingBlood(double fastingBlood) {
        this.fastingBlood = fastingBlood;
    }

    public double getPostprandialBlood() {
        return postprandialBlood;
    }

    public void setPostprandialBlood(double postprandialBlood) {
        this.postprandialBlood = postprandialBlood;
    }

    public double getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public double getHdl() {
        return hdl;
    }

    public void setHdl(double hdl) {
        this.hdl = hdl;
    }

    public double getTriglyceride() {
        return triglyceride;
    }

    public void setTriglyceride(double triglyceride) {
        this.triglyceride = triglyceride;
    }

    public double getLdl() {
        return ldl;
    }

    public void setLdl(double ldl) {
        this.ldl = ldl;
    }

    public double getUricAcid() {
        return uricAcid;
    }

    public void setUricAcid(double uricAcid) {
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

    public long getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(long heartRate) {
        this.heartRate = heartRate;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getIdentitycards() {
        return identitycards;
    }

    public void setIdentitycards(String identitycards) {
        this.identitycards = identitycards;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getGenders() {
        return genders;
    }

    public void setGenders(String genders) {
        this.genders = genders;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public long getGuardian() {
        return guardian;
    }

    public void setGuardian(long guardian) {
        this.guardian = guardian;
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
}
