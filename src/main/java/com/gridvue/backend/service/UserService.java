package com.gridvue.backend.service;

import java.util.List;

import com.gridvue.backend.dto.UserDto;

public interface UserService {
  List<UserDto> list();
  List<UserDto> list(UserDto userDto);
  UserDto detail(int u_no);
  UserDto idCheck(String u_id);
  int register(UserDto userDto);
  int modify(UserDto userDto);
  int remove(int u_no);

}
