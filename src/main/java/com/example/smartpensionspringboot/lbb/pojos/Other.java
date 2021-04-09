package com.example.smartpensionspringboot.lbb.pojos;


import java.math.BigDecimal;
import java.util.Date;

/**
 * 消费登记实体类
 */
public class Other {
    private Integer id;
    private Integer old_id;
    private Integer category_id;
    private BigDecimal money;
    private Date money_time;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
    private Old old;
    public Category category;

    public Other() {
    }

    public Other(Integer id, Integer old_id, Integer category_id, BigDecimal money, Date money_time, String remark, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.old_id = old_id;
        this.category_id = category_id;
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

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
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

    public Old getOld() {
        return old;
    }

    public void setOld(Old old) {
        this.old = old;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Other{" +
                "id=" + id +
                ", old_id=" + old_id +
                ", category_id=" + category_id +
                ", money=" + money +
                ", money_time=" + money_time +
                ", remark='" + remark + '\'' +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                ", old=" + old +
                ", category=" + category +
                '}';
    }
}
