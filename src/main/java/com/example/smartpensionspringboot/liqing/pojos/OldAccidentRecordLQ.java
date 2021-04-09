package com.example.smartpensionspringboot.liqing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Objects;


public class OldAccidentRecordLQ {
    private long arId;
    private Timestamp arTime;
    private String arCause;
    private String arDescribe;
    private String arPhoto;
    private Integer arState;

    //护工表
    private NurseLQ nurse;

    //类型表
    private OldAccidentTypeLQ type;

    //用户表
    private UserLQ user;

    //老人表
    private RecOldLQ old;

    //床位表
    private RecBedLQ bed;

    public RecOldLQ getOld() {
        return old;
    }

    public void setOld(RecOldLQ old) {
        this.old = old;
    }

    public RecBedLQ getBed() {
        return bed;
    }

    public void setBed(RecBedLQ bed) {
        this.bed = bed;
    }

    public NurseLQ getNurse() {
        return nurse;
    }

    public void setNurse(NurseLQ nurse) {
        this.nurse = nurse;
    }

    public OldAccidentTypeLQ getType() {
        return type;
    }

    public void setType(OldAccidentTypeLQ type) {
        this.type = type;
    }

    public UserLQ getUser() {
        return user;
    }

    public void setUser(UserLQ user) {
        this.user = user;
    }

    public long getArId() {
        return arId;
    }

    public void setArId(long arId) {
        this.arId = arId;
    }


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getArTime() {
        return arTime;
    }

    public void setArTime(Timestamp arTime) {
        this.arTime = arTime;
    }


    public String getArCause() {
        return arCause;
    }

    public void setArCause(String arCause) {
        this.arCause = arCause;
    }

    public String getArDescribe() {
        return arDescribe;
    }

    public void setArDescribe(String arDescribe) {
        this.arDescribe = arDescribe;
    }

    public String getArPhoto() {
        return arPhoto;
    }

    public void setArPhoto(String arPhoto) {
        this.arPhoto = arPhoto;
    }

    public Integer getArState() {
        return arState;
    }

    public void setArState(Integer arState) {
        this.arState = arState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldAccidentRecordLQ that = (OldAccidentRecordLQ) o;
        return arId == that.arId &&

                Objects.equals(arTime, that.arTime) &&
                Objects.equals(arCause, that.arCause) &&
                Objects.equals(arDescribe, that.arDescribe) &&
                Objects.equals(arPhoto, that.arPhoto) &&
                Objects.equals(arState, that.arState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arId, arTime,  arCause, arDescribe, arPhoto, arState);
    }
}
