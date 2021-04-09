package com.example.smartpensionspringboot.yxj.pojos;

import java.util.Objects;

public class Drug {
    private Integer drugId;
    private String drugCode;
    private String drugName;
    private String drugSize;
    private String drugType;
    private String drugVender;
    private Integer categoryId;
    private Integer deposite_num;

    public Integer getDeposite_num() {
        return deposite_num;
    }

    public void setDeposite_num(Integer deposite_num) {
        this.deposite_num = deposite_num;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugSize() {
        return drugSize;
    }

    public void setDrugSize(String drugSize) {
        this.drugSize = drugSize;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugVender() {
        return drugVender;
    }

    public void setDrugVender(String drugVender) {
        this.drugVender = drugVender;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug drug = (Drug) o;
        return drugId == drug.drugId &&
                Objects.equals(drugCode, drug.drugCode) &&
                Objects.equals(drugName, drug.drugName) &&
                Objects.equals(drugSize, drug.drugSize) &&
                Objects.equals(drugType, drug.drugType) &&
                Objects.equals(drugVender, drug.drugVender) &&
                Objects.equals(categoryId, drug.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drugId, drugCode, drugName, drugSize, drugType, drugVender, categoryId);
    }

    //多对一的对应药品类别表
    public Categorys categories;

    public Categorys getCategories() {
        return categories;
    }

    public void setCategories(Categorys categories) {
        this.categories = categories;
    }




    //多个药品对应一个缴存
    private Deposite deposite;

    public Deposite getDeposite() {
        return deposite;
    }

    public void setDeposite(Deposite deposite) {
        this.deposite = deposite;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "drugId=" + drugId +
                ", drugCode='" + drugCode + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugSize='" + drugSize + '\'' +
                ", drugType='" + drugType + '\'' +
                ", drugVender='" + drugVender + '\'' +
                ", categoryId=" + categoryId +
                ", categories=" + categories +
                ", deposite=" + deposite +
                '}';
    }
}
