package com.example.smartpensionspringboot.liqing.pojos;

import java.sql.Timestamp;
import java.util.Objects;

public class RecOldLQ {
    private long oldId;
    private String oldName;
    private String identitycard;
    private String gender;
    private String phone;
    private String address;
    private Timestamp contractTime;
    private Timestamp joinTime;
    private String handle;
    private Long archives;
    private Timestamp ctime;
    private Timestamp utime;
    private Timestamp dtime;
    private Long status;

    private OldOutRegisterLQ register;

    //家属信息表
    private RecFamilyLQ family;

    public RecFamilyLQ getFamily() {
        return family;
    }

    public void setFamily(RecFamilyLQ family) {
        this.family = family;
    }

    public OldOutRegisterLQ getRegister() {
        return register;
    }

    public void setRegister(OldOutRegisterLQ register) {
        this.register = register;
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

    public Timestamp getContractTime() {
        return contractTime;
    }

    public void setContractTime(Timestamp contractTime) {
        this.contractTime = contractTime;
    }

    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Long getArchives() {
        return archives;
    }

    public void setArchives(Long archives) {
        this.archives = archives;
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

    public Timestamp getDtime() {
        return dtime;
    }

    public void setDtime(Timestamp dtime) {
        this.dtime = dtime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecOldLQ recOldLQ = (RecOldLQ) o;
        return oldId == recOldLQ.oldId &&
                Objects.equals(oldName, recOldLQ.oldName) &&
                Objects.equals(identitycard, recOldLQ.identitycard) &&
                Objects.equals(gender, recOldLQ.gender) &&
                Objects.equals(phone, recOldLQ.phone) &&
                Objects.equals(address, recOldLQ.address) &&
                Objects.equals(contractTime, recOldLQ.contractTime) &&
                Objects.equals(joinTime, recOldLQ.joinTime) &&
                Objects.equals(handle, recOldLQ.handle) &&
                Objects.equals(archives, recOldLQ.archives) &&
                Objects.equals(ctime, recOldLQ.ctime) &&
                Objects.equals(utime, recOldLQ.utime) &&
                Objects.equals(dtime, recOldLQ.dtime) &&
                Objects.equals(status, recOldLQ.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldId, oldName, identitycard, gender, phone, address, contractTime, joinTime, handle, archives, ctime, utime, dtime, status);
    }
}
