package com.example.smartpensionspringboot.liqing.pojos;

import java.util.Objects;

public class OldAccidentTypeLQ {
    private Integer atId;
    private String atName;
    private String atLevel;
    private String atDescribed;
    private String atDeal;
    private Integer atState;

    //护工表
    private NurseLQ nurse;

    public Integer getAtId() {
        return atId;
    }

    public void setAtId(Integer atId) {
        this.atId = atId;
    }

    public String getAtName() {
        return atName;
    }

    public void setAtName(String atName) {
        this.atName = atName;
    }

    public String getAtLevel() {
        return atLevel;
    }

    public void setAtLevel(String atLevel) {
        this.atLevel = atLevel;
    }

    public String getAtDescribed() {
        return atDescribed;
    }

    public void setAtDescribed(String atDescribed) {
        this.atDescribed = atDescribed;
    }

    public String getAtDeal() {
        return atDeal;
    }

    public void setAtDeal(String atDeal) {
        this.atDeal = atDeal;
    }

    public NurseLQ getNurse() {
        return nurse;
    }

    public void setNurse(NurseLQ nurse) {
        this.nurse = nurse;
    }

    public Integer getAtState() {
        return atState;
    }

    public void setAtState(Integer atState) {
        this.atState = atState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldAccidentTypeLQ that = (OldAccidentTypeLQ) o;
        return atId == that.atId &&
                Objects.equals(atName, that.atName) &&
                Objects.equals(atState, that.atState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atId, atName, atState);
    }
}
