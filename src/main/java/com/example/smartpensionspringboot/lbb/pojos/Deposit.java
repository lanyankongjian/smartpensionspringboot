package com.example.smartpensionspringboot.lbb.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 押金
 */
public class Deposit {
    private Integer id;
    private Integer old_id;
    private BigDecimal margin;
    private String deposit_name;
    private int state;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date get_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date return_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date insert_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date delete_time;
    private Old old;

    public Deposit() {
    }

    public Deposit(Integer id, Integer old_id, BigDecimal margin, String deposit_name, int state, Date get_time, Date return_time, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.old_id = old_id;
        this.margin = margin;
        this.deposit_name = deposit_name;
        this.state = state;
        this.get_time = get_time;
        this.return_time = return_time;
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

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public String getDeposit_name() {
        return deposit_name;
    }

    public void setDeposit_name(String deposit_name) {
        this.deposit_name = deposit_name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getGet_time() {
        return get_time;
    }

    public void setGet_time(Date get_time) {
        this.get_time = get_time;
    }

    public Date getReturn_time() {
        return return_time;
    }

    public void setReturn_time(Date return_time) {
        this.return_time = return_time;
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

    @Override
    public String toString() {
        return "Deposit{" +
                "id=" + id +
                ", old_id=" + old_id +
                ", margin=" + margin +
                ", deposit_name='" + deposit_name + '\'' +
                ", state=" + state +
                ", get_time=" + get_time +
                ", return_time=" + return_time +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                ", old=" + old +
                '}';
    }
}
