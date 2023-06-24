package com.gridvue.backend.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class UserDto {
  
  private int u_no;
  private String u_id;
  private String uname;
  private String gender;
  private String post_time;
  private String nation;
  private String city;

  private String toTime;
  private String fromTime;
  
  public void setPostTime(Date dbDate){
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    this.post_time=formatter.format(dbDate);
  }
}
