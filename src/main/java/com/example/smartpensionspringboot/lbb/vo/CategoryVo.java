package com.example.smartpensionspringboot.lbb.vo;


import java.math.BigDecimal;
import java.util.Date;

public class CategoryVo {
    private Integer id;
    private String category_name;
    private String cost_text;
    private BigDecimal fees;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;

    public CategoryVo() {
    }

    public CategoryVo(Integer id, String category_name, String cost_text, BigDecimal fees, String remark, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.category_name = category_name;
        this.cost_text = cost_text;
        this.fees = fees;
        this.remark = remark;
        this.insert_time = insert_time;
        this.update_time = update_time;
        this.delete_time = delete_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCost_text() {
        return cost_text;
    }

    public void setCost_text(String cost_text) {
        this.cost_text = cost_text;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(Date insert_time) {
        this.insert_time = insert_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Date getDelete_time() {
        return delete_time;
    }

    public void setDelete_time(Date delete_time) {
        this.delete_time = delete_time;
    }

    @Override
    public String toString() {
        return "CategoryVo{" +
                "id=" + id +
                ", category_name='" + category_name + '\'' +
                ", cost_text='" + cost_text + '\'' +
                ", fees=" + fees +
                ", remark='" + remark + '\'' +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                '}';
    }
}
