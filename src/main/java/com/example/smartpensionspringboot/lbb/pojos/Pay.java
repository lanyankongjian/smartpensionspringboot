package com.example.smartpensionspringboot.lbb.pojos;


import java.math.BigDecimal;
import java.util.Date;

/**
 * 入住交费
 */
public class Pay {
    private Integer id;
    private Integer old_id;
    private String tollman;
    private String payer;
    private BigDecimal amount;
    private Date amount_time;
    private int pay_style;
    private String remark;
    private Date insert_time;
    private Date update_time;
    private Date delete_time;
    private Old old;

    public Pay() {
    }

    public Pay(Integer id, Integer old_id, String tollman, String payer, BigDecimal amount, Date amount_time, int pay_style, String remark, Date insert_time, Date update_time, Date delete_time) {
        this.id = id;
        this.old_id = old_id;
        this.tollman = tollman;
        this.payer = payer;
        this.amount = amount;
        this.amount_time = amount_time;
        this.pay_style = pay_style;
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
        return "Pay{" +
                "id=" + id +
                ", old_id=" + old_id +
                ", tollman='" + tollman + '\'' +
                ", payer='" + payer + '\'' +
                ", amount=" + amount +
                ", amount_time=" + amount_time +
                ", pay_style=" + pay_style +
                ", remark='" + remark + '\'' +
                ", insert_time=" + insert_time +
                ", update_time=" + update_time +
                ", delete_time=" + delete_time +
                ", old=" + old +
                '}';
    }
}
