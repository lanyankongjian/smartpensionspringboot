package com.example.smartpensionspringboot.liqing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Objects;

public class OldVisitLQ {
    private long vId;
    private String vCname;
    private String vCphone;
    private String vRelation;
    private Timestamp vCtime;
    private Timestamp vGtime;
    private String vCause;
    private String vRemark;
    private Integer vLeave;
    private Integer vState;

    //老人详细表
    private RecOldLQ old;

    //用户表
    private UserLQ user;

    public RecOldLQ getOld() {
        return old;
    }

    public void setOld(RecOldLQ old) {
        this.old = old;
    }

    public UserLQ getUser() {
        return user;
    }

    public void setUser(UserLQ user) {
        this.user = user;
    }

    public long getvId() {
        return vId;
    }

    public void setvId(long vId) {
        this.vId = vId;
    }

    public String getvCname() {
        return vCname;
    }

    public void setvCname(String vCname) {
        this.vCname = vCname;
    }

    public String getvCphone() {
        return vCphone;
    }

    public void setvCphone(String vCphone) {
        this.vCphone = vCphone;
    }

    public String getvRelation() {
        return vRelation;
    }

    public void setvRelation(String vRelation) {
        this.vRelation = vRelation;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getvCtime() {
        return vCtime;
    }

    public void setvCtime(Timestamp vCtime) {
        this.vCtime = vCtime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getvGtime() {
        return vGtime;
    }

    public void setvGtime(Timestamp vGtime) {
        this.vGtime = vGtime;
    }

    public String getvCause() {
        return vCause;
    }

    public void setvCause(String vCause) {
        this.vCause = vCause;
    }

    public String getvRemark() {
        return vRemark;
    }

    public void setvRemark(String vRemark) {
        this.vRemark = vRemark;
    }

    public Integer getvLeave() {
        return vLeave;
    }

    public void setvLeave(Integer vLeave) {
        this.vLeave = vLeave;
    }

    public Integer getvState() {
        return vState;
    }

    public void setvState(Integer vState) {
        this.vState = vState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldVisitLQ that = (OldVisitLQ) o;
        return vId == that.vId &&
                Objects.equals(vCname, that.vCname) &&
                Objects.equals(vCphone, that.vCphone) &&
                Objects.equals(vCtime, that.vCtime) &&
                Objects.equals(vGtime, that.vGtime) &&
                Objects.equals(vCause, that.vCause) &&
                Objects.equals(vRemark, that.vRemark) &&
                Objects.equals(vLeave, that.vLeave) &&
                Objects.equals(vState, that.vState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vId, vCname, vCphone,  vCtime, vGtime, vCause, vRemark, vLeave, vState);
    }
}
