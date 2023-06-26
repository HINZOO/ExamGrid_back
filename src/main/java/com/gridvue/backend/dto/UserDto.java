package com.gridvue.backend.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class UserDto {
  
  private int u_no;
  private String u_id;
  private String uname;
  private String gender;//boolean
  private String post_time;
  private String nation;
  private String city;
  private int age;
  private String ward;//구
  private String job;
  private String hobby;
  private String foodcate;
  private String foodtype;
  private String ismarried;// boolean

  private String toTime;
  private String fromTime;
  
  public void setPostTime(Date dbDate){
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    this.post_time=formatter.format(dbDate);
  }
}
