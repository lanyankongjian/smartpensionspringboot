package com.example.smartpensionspringboot.liqing.pojos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

public class RecBedLQ {
    private long bedId;
    private byte[] bedType;
    private Boolean isroom;
    private String bed;
    private BigDecimal cost;
    private String remarks;
    private Timestamp ctime;
    private Timestamp utime;
    private Timestamp dtime;

    //老人基本信息表
    private RecOldLQ old;

    public RecOldLQ getOld() {
        return old;
    }

    public void setOld(RecOldLQ old) {
        this.old = old;
    }

    public long getBedId() {
        return bedId;
    }

    public void setBedId(long bedId) {
        this.bedId = bedId;
    }

    public byte[] getBedType() {
        return bedType;
    }

    public void setBedType(byte[] bedType) {
        this.bedType = bedType;
    }

    public Boolean getIsroom() {
        return isroom;
    }

    public void setIsroom(Boolean isroom) {
        this.isroom = isroom;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecBedLQ recBedLQ = (RecBedLQ) o;
        return bedId == recBedLQ.bedId &&
                Arrays.equals(bedType, recBedLQ.bedType) &&
                Objects.equals(isroom, recBedLQ.isroom) &&
                Objects.equals(bed, recBedLQ.bed) &&
                Objects.equals(cost, recBedLQ.cost) &&
                Objects.equals(remarks, recBedLQ.remarks) &&
                Objects.equals(ctime, recBedLQ.ctime) &&
                Objects.equals(utime, recBedLQ.utime) &&
                Objects.equals(dtime, recBedLQ.dtime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(bedId, isroom, bed, cost, remarks, ctime, utime, dtime);
        result = 31 * result + Arrays.hashCode(bedType);
        return result;
    }
}
