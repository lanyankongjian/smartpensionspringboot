package com.example.smartpensionspringboot.lbb.vo;

public class DepositVo {
    private String old_name;
    private String identitycard;

    public DepositVo() {
    }

    public DepositVo(String old_name, String identitycard) {
        this.old_name = old_name;
        this.identitycard = identitycard;
    }

    public String getOld_name() {
        return old_name;
    }

    public void setOld_name(String old_name) {
        this.old_name = old_name;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    @Override
    public String toString() {
        return "DepositVo{" +
                "old_name='" + old_name + '\'' +
                ", identitycard='" + identitycard + '\'' +
                '}';
    }
}
