package com.gridvue.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gridvue.backend.dto.NationDto;

@Mapper
public interface LocationMapper {

  List<NationDto> findAll();
  List<NationDto> findByLocParent(String loc_parent);
}
