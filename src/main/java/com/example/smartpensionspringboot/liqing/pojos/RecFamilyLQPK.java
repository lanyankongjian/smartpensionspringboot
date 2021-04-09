package com.example.smartpensionspringboot.liqing.pojos;

import java.io.Serializable;
import java.util.Objects;

public class RecFamilyLQPK implements Serializable {
    private long familyId;
    private long oldId;

    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    public long getOldId() {
        return oldId;
    }

    public void setOldId(long oldId) {
        this.oldId = oldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecFamilyLQPK that = (RecFamilyLQPK) o;
        return familyId == that.familyId &&
                oldId == that.oldId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyId, oldId);
    }
}
