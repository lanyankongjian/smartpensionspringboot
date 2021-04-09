package com.example.smartpensionspringboot.yxj.pojos;



import com.example.smartpensionspringboot.cj.pojos.RecOld;
import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Deposite {
    private int depositeId;
    private String depositeMode;
    private Integer depositeNum;
    private Integer depositeZt;
    private Integer depositeWarning;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date depositeTime;
    private int oldId;
    private Integer drugId;

    public int getDepositeId() {
        return depositeId;
    }

    public void setDepositeId(int depositeId) {
        this.depositeId = depositeId;
    }

    public String getDepositeMode() {
        return depositeMode;
    }

    public void setDepositeMode(String depositeMode) {
        this.depositeMode = depositeMode;
    }

    public Integer getDepositeNum() {
        return depositeNum;
    }

    public void setDepositeNum(Integer depositeNum) {
        this.depositeNum = depositeNum;
    }

    public Integer getDepositeZt() {
        return depositeZt;
    }

    public void setDepositeZt(Integer depositeZt) {
        this.depositeZt = depositeZt;
    }

    public Integer getDepositeWarning() {
        return depositeWarning;
    }

    public void setDepositeWarning(Integer depositeWarning) {
        this.depositeWarning = depositeWarning;
    }

    public Date getDepositeTime() {
        return depositeTime;
    }

    public void setDepositeTime(Date depositeTime) {
        this.depositeTime = depositeTime;
    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposite deposite = (Deposite) o;
        return depositeId == deposite.depositeId &&
                oldId == deposite.oldId &&
                Objects.equals(depositeMode, deposite.depositeMode) &&
                Objects.equals(depositeNum, deposite.depositeNum) &&
                Objects.equals(depositeZt, deposite.depositeZt) &&
                Objects.equals(depositeWarning, deposite.depositeWarning) &&
                Objects.equals(depositeTime, deposite.depositeTime) &&
                Objects.equals(drugId, deposite.drugId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depositeId, depositeMode, depositeNum, depositeZt, depositeWarning, depositeTime, oldId, drugId);
    }

    //一个缴存对应多个药品
    private List<Drug> drugList;

    public List<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(List<Drug> drugList) {
        this.drugList = drugList;
    }


    //

    private RecOld recOld;

    public RecOld getRecOld() {
        return recOld;
    }

    public void setRecOld(RecOld recOld) {
        this.recOld = recOld;
    }

    public Deposite() {
    }


    public Deposite(int depositeId, String depositeMode, Integer depositeNum, Integer depositeZt, Integer depositeWarning, Date depositeTime,Integer drugId, RecOld recOld) {
        this.depositeId = depositeId;
        this.depositeMode = depositeMode;
        this.depositeNum = depositeNum;
        this.depositeZt = depositeZt;
        this.depositeWarning = depositeWarning;
        this.depositeTime = depositeTime;
        this.drugId = drugId;
        this.recOld = recOld;
    }

    @Override
    public String toString() {
        return "Deposite{" +
                "depositeId=" + depositeId +
                ", depositeMode='" + depositeMode + '\'' +
                ", depositeNum=" + depositeNum +
                ", depositeZt=" + depositeZt +
                ", depositeWarning=" + depositeWarning +
                ", depositeTime=" + depositeTime +
                ", oldId=" + oldId +
                ", drugId=" + drugId +
                ", drugList=" + drugList +
                ", recOld=" + recOld +
                '}';
    }
}
