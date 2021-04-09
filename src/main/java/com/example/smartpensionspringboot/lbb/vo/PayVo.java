package com.example.smartpensionspringboot.lbb.vo;


import java.math.BigDecimal;
import java.util.Date;

public class PayVo {
    private Integer old_id;
    private String tollman;
    private String payer;
    private BigDecimal amount;
    private Date amount_time;
    private int pay_style;
    private String remark;

    public PayVo() {
    }

    public PayVo(Integer old_id, String tollman, String payer, BigDecimal amount, Date amount_time, int pay_style, String remark) {
        this.old_id = old_id;
        this.tollman = tollman;
        this.payer = payer;
        this.amount = amount;
        this.amount_time = amount_time;
        this.pay_style = pay_style;
        this.remark = remark;
    }

    public Integer getOld_id() {
        return old_id;
    }

    public void setOld_id(Integer old_id) {
        this.old_id = old_id;
    }

    public String getTollman() {
        return tollman;
    }

    public void setTollman(String tollman) {
        this.tollman = tollman;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getAmount_time() {
        return amount_time;
    }

    public void setAmount_time(Date amount_time) {
        this.amount_time = amount_time;
    }

    public int getPay_style() {
        return pay_style;
    }

    public void setPay_style(int pay_style) {
        this.pay_style = pay_style;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PayVo{" +
                "old_id=" + old_id +
                ", tollman='" + tollman + '\'' +
                ", payer='" + payer + '\'' +
                ", amount=" + amount +
                ", amount_time=" + amount_time +
                ", pay_style=" + pay_style +
                ", remark='" + remark + '\'' +
                '}';
    }
}
