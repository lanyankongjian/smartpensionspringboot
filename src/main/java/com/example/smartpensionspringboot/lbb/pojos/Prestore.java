package com.example.smartpensionspringboot.lbb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 预存管理
 */
public class Prestore {
    private Integer id;
    private Integer old_id;
    private Integer detail_id;
    private BigDecimal amount;
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date insert_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date delete_time;
    private Old old;
    private DetailStorage detailStorage;
    private Bed bed;

    public Prestore() {
    }

    public Prestore(Integer id, Integer old_id, Integer detail_id, BigDecimal amount, String remark, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.old_id = old_id;
        this.detail_id = detail_id;
        this.amount = amount;
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

    public Integer getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(Integer detail_id) {
        this.detail_id = detail_id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public DetailStorage getDetailStorage() {
        return detailStorage;
    }

    public void setDetailStorage(DetailStorage detailStorage) {
        this.detailStorage = detailStorage;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "Prestore{" +
                "id=" + id +
                ", old_id=" + old_id +
                ", detail_id=" + detail_id +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                ", old=" + old +
                ", detailStorage=" + detailStorage +
                ", bed=" + bed +
                '}';
    }
}
