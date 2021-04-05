package com.example.smartpensionspringboot.lbb.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class Old {
  private Integer oldId;
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

}
