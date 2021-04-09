package com.example.smartpensionspringboot.liqing.pojos;

import java.sql.Timestamp;
import java.util.Objects;

public class RecFamilyLQ {
    private long familyId;
    private String familyname;
    private String phone;
    private String identitycard;
    private String relationship;
    private Object gender;
    private String address;
    private Byte guardian;
    private Timestamp ctime;
    private Timestamp utime;
    private int status;

    //老人基本信息表
    private RecOldLQ old;

    public RecOldLQ getOld() {
        return old;
    }

    public void setOld(RecOldLQ old) {
        this.old = old;
    }

    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }


    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getGuardian() {
        return guardian;
    }

    public void setGuardian(Byte guardian) {
        this.guardian = guardian;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecFamilyLQ that = (RecFamilyLQ) o;
        return familyId == that.familyId &&
                Objects.equals(familyname, that.familyname) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(identitycard, that.identitycard) &&
                Objects.equals(relationship, that.relationship) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(address, that.address) &&
                Objects.equals(guardian, that.guardian) &&
                Objects.equals(ctime, that.ctime) &&
                Objects.equals(utime, that.utime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyId, familyname, phone, identitycard, relationship, gender, address, guardian, ctime, utime, status);
    }
}
