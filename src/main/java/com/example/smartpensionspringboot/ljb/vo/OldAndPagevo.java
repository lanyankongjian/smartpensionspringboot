package com.example.smartpensionspringboot.ljb.vo;

import lombok.Data;

import java.util.Date;

@Data
public class OldAndPagevo {
    private Long oldId;
    private String oldName;
    private String identitycard;
    private String gender;
    private String phone;
    private String address;
    private Date contractTime;
    private Date joinTime;
    private String handle;
    private Long archives;
    private Date ctime;
    private Date utime;
    private Date dtime;
    private Long status;
    private int currentPage;
    private int pageSize;
}
