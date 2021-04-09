package com.example.smartpensionspringboot.ljb.vo;

import lombok.Data;

import java.util.Date;

@Data
public class Healthvo {
    private Long hiId;
    private Long oldId;
    private String selfcare;
    private String vision;
    private String hospital;
    private String hearing;
    private String doctor;
    private String doctorPhone;
    private String allergy;
    private String medicalHistory;
    private String mainDiseases;
    private Date ctime;
    private Date utime;
    private Date dtime;
    private int currentPage;
    private int pageSize;
}
