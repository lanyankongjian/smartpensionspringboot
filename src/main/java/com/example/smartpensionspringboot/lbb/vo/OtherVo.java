package com.example.smartpensionspringboot.lbb.vo;


import java.math.BigDecimal;
import java.util.Date;

public class OtherVo {
    private Integer id;
    private Integer old_id;
    private String old_name;
    private Integer category_id;
    private String category_name;
    private BigDecimal money;
    private Date money_time;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;

    public OtherVo() {
    }

    public OtherVo(Integer id, Integer old_id, String old_name, Integer category_id, String category_name, BigDecimal money, Date money_time, String remark, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.old_id = old_id;
        this.old_name = old_name;
        this.category_id = category_id;
        this.category_name = category_name;
        this.money = money;
        this.money_time = money_time;
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

    public Integer getOld_id() {
        return old_id;
    }

    public void setOld_id(Integer old_id) {
        this.old_id = old_id;
    }

    public String getOld_name() {
        return old_name;
    }

    public void setOld_name(String old_name) {
        this.old_name = old_name;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getMoney_time() {
        return money_time;
    }

    public void setMoney_time(Date money_time) {
        this.money_time = money_time;
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
        return "OtherVo{" +
                "id=" + id +
                ", old_id=" + old_id +
                ", old_name='" + old_name + '\'' +
                ", category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", money=" + money +
                ", money_time=" + money_time +
                ", remark='" + remark + '\'' +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                '}';
    }
}
