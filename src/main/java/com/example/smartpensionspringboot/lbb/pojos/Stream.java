package com.example.smartpensionspringboot.lbb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 费用流水
 */
public class Stream {
    private Integer id;
    private Integer old_id;
    private Integer category_id;
    private BigDecimal money;
    private String tollman;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date maney_time;
    private String maney_text;
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date insert_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date delete_time;
    private Old old;
    private Category category;
    private Bed bed;

    public Stream() {
    }

    public Stream(Integer id, Integer old_id, Integer category_id, BigDecimal money, String tollman, Date maney_time, String maney_text, String remark, Date insert_time, Date update_time, Date delete_time, Old old, Category category, Bed bed) {
        this.id = id;
        this.old_id = old_id;
        this.category_id = category_id;
        this.money = money;
        this.tollman = tollman;
        this.maney_time = maney_time;
        this.maney_text = maney_text;
        this.remark = remark;
        this.insert_time = insert_time;
        this.update_time = update_time;
        this.delete_time = delete_time;
        this.old = old;
        this.category = category;
        this.bed = bed;
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

    public String getTollman() {
        return tollman;
    }

    public void setTollman(String tollman) {
        this.tollman = tollman;
    }

    public Date getManey_time() {
        return maney_time;
    }

    public void setManey_time(Date maney_time) {
        this.maney_time = maney_time;
    }

    public String getManey_text() {
        return maney_text;
    }

    public void setManey_text(String maney_text) {
        this.maney_text = maney_text;
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

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }
}
