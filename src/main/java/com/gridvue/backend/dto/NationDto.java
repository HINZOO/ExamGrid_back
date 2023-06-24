package com.gridvue.backend.dto;

import lombok.Data;

@Data
public class NationDto {
  private String loc_type; //'N':국가 'C':도시
  private String loc_name;
  private String loc_parent;
}
