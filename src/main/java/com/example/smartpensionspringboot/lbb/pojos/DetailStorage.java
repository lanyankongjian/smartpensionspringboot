package com.example.smartpensionspringboot.lbb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 预存详情
 */
@Data
public class DetailStorage {
    private Integer id;
    private String tollman;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date charging_time;
    private String dexplain;
    private String payment;
    private BigDecimal amount;
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date insert_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date delete_time;

    public DetailStorage() {
    }

    public DetailStorage(Integer id, String tollman, Date charging_time, String dexplain, String payment, BigDecimal amount, String remark, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.tollman = tollman;
        this.charging_time = charging_time;
        this.dexplain = dexplain;
        this.payment = payment;
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

    public String getTollman() {
        return tollman;
    }

    public void setTollman(String tollman) {
        this.tollman = tollman;
    }

    public Date getCharging_time() {
        return charging_time;
    }

    public void setCharging_time(Date charging_time) {
        this.charging_time = charging_time;
    }

    public String getDexplain() {
        return dexplain;
    }

    public void setDexplain(String dexplain) {
        this.dexplain = dexplain;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
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

    @Override
    public String toString() {
        return "DetailStorage{" +
                "id=" + id +
                ", tollman='" + tollman + '\'' +
                ", charging_time=" + charging_time +
                ", dexplain='" + dexplain + '\'' +
                ", payment='" + payment + '\'' +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                '}';
    }
}
