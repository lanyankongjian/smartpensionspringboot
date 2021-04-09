package com.example.smartpensionspringboot.liqing.pojos;

import java.util.Objects;

public class NurseLQ {
    private long nuId;
    private String nuName;
    private String nuPhone;

    public long getNuId() {
        return nuId;
    }

    public void setNuId(long nuId) {
        this.nuId = nuId;
    }

    public String getNuName() {
        return nuName;
    }

    public void setNuName(String nuName) {
        this.nuName = nuName;
    }

    public String getNuPhone() {
        return nuPhone;
    }

    public void setNuPhone(String nuPhone) {
        this.nuPhone = nuPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NurseLQ nurseLQ = (NurseLQ) o;
        return nuId == nurseLQ.nuId &&
                Objects.equals(nuName, nurseLQ.nuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nuId, nuName);
    }
}
