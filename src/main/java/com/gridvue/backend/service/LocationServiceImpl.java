package com.gridvue.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gridvue.backend.dto.NationDto;
import com.gridvue.backend.mapper.LocationMapper;

@Service
public class LocationServiceImpl implements LocationService{
  @Autowired
  private LocationMapper locationMapper;

  @Override
  public List<NationDto> list() {
    List<NationDto> list= locationMapper.findAll();
    return list;
  }

  @Override
  public List<NationDto> cities(String locParent) {
    List<NationDto> cities = locationMapper.findByLocParent(locParent);
    return cities;
  }
  
}
