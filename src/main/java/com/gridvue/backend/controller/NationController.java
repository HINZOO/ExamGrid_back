package com.gridvue.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gridvue.backend.dto.NationDto;
import com.gridvue.backend.service.LocationService;

@RestController
public class NationController {
  @Autowired
  private LocationService locationService;
  @GetMapping("/loc/locList")
  public List<NationDto> getLocList(){
    List<NationDto> locs=locationService.list();
    return locs;
  }

  @PostMapping("/loc/cites")
  public List<NationDto> getCity(@RequestBody Map<String,String> params){
    List<NationDto> cites=locationService.cities(params.get("nation"));
    return cites;
  }

  
}
