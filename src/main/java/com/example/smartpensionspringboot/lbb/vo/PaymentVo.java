package com.example.smartpensionspringboot.lbb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PaymentVo {
    private String old_name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date time;

    public PaymentVo() {
    }

    public PaymentVo(String old_name, Date time) {
        this.old_name = old_name;
        this.time = time;
    }

    public String getOld_name() {
        return old_name;
    }

    public void setOld_name(String old_name) {
        this.old_name = old_name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PaymentVo{" +
                "old_name='" + old_name + '\'' +
                ", time=" + time +
                '}';
    }
}
