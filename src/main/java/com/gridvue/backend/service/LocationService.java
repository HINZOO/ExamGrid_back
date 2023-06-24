package com.gridvue.backend.service;

import java.util.List;

import com.gridvue.backend.dto.NationDto;


public interface LocationService {
  List<NationDto> list();
  List<NationDto> cities(String locParent);
  
}
