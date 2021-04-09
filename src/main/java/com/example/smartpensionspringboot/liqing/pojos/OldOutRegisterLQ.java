package com.example.smartpensionspringboot.liqing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Objects;

public class OldOutRegisterLQ {
    private Integer orId;
    private Long orBackid;
    private Timestamp orTime;
    private Timestamp orPlantime;
    private Timestamp orPretime;
    private String orCause;
    private Integer orDaynum;
    private Integer orBack;
    private Integer orState;

    //老人基本信息表
    private RecOldLQ old;

    //家属信息表
    private RecFamilyLQ family;

    //床位表
    private RecBedLQ bed;

    //用户表
    private UserLQ user;

    public UserLQ getUser() {
        return user;
    }

    public void setUser(UserLQ user) {
        this.user = user;
    }

    public RecBedLQ getBed() {
        return bed;
    }

    public void setBed(RecBedLQ bed) {
        this.bed = bed;
    }

    public RecFamilyLQ getFamily() {
        return family;
    }

    public void setFamily(RecFamilyLQ family) {
        this.family = family;
    }

    public RecOldLQ getOld() {
        return old;
    }

    public void setOld(RecOldLQ old) {
        this.old = old;
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }


    public Long getOrBackid() {
        return orBackid;
    }

    public void setOrBackid(Long orBackid) {
        this.orBackid = orBackid;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getOrTime() {
        return orTime;
    }

    public void setOrTime(Timestamp orTime) {
        this.orTime = orTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getOrPlantime() {
        return orPlantime;
    }

    public void setOrPlantime(Timestamp orPlantime) {
        this.orPlantime = orPlantime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getOrPretime() {
        return orPretime;
    }

    public void setOrPretime(Timestamp orPretime) {
        this.orPretime = orPretime;
    }

    public String getOrCause() {
        return orCause;
    }

    public void setOrCause(String orCause) {
        this.orCause = orCause;
    }

    public Integer getOrDaynum() {
        return orDaynum;
    }

    public void setOrDaynum(Integer orDaynum) {
        this.orDaynum = orDaynum;
    }

    public Integer getOrBack() {
        return orBack;
    }

    public void setOrBack(Integer orBack) {
        this.orBack = orBack;
    }

    public Integer getOrState() {
        return orState;
    }

    public void setOrState(Integer orState) {
        this.orState = orState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldOutRegisterLQ that = (OldOutRegisterLQ) o;
        return orId == that.orId &&
                Objects.equals(orBackid, that.orBackid) &&
                Objects.equals(orTime, that.orTime) &&
                Objects.equals(orPlantime, that.orPlantime) &&
                Objects.equals(orPretime, that.orPretime) &&
                Objects.equals(orCause, that.orCause) &&
                Objects.equals(orDaynum, that.orDaynum) &&
                Objects.equals(orBack, that.orBack) &&
                Objects.equals(orState, that.orState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orId, orBackid, orTime, orPlantime, orPretime, orCause, orDaynum, orBack, orState);
    }

    @Override
    public String toString() {
        return "OldOutRegisterLQ{" +
                "orId=" + orId +
                ", orBackid=" + orBackid +
                ", orTime=" + orTime +
                ", orPlantime=" + orPlantime +
                ", orPretime=" + orPretime +
                ", orCause='" + orCause + '\'' +
                ", orDaynum=" + orDaynum +
                ", orBack=" + orBack +
                ", orState=" + orState +
                ", old=" + old +
                ", family=" + family +
                ", bed=" + bed +
                ", user=" + user +
                '}';
    }
}
