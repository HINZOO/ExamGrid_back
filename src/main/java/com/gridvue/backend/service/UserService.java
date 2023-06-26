package com.gridvue.backend.service;

import java.util.List;

import com.gridvue.backend.dto.UserDto;

public interface UserService {
  List<UserDto> list();
  List<UserDto> list(UserDto userDto);
  List<UserDto> list1List();
  List<UserDto> link1List(UserDto userDto);
  UserDto detail(int u_no);
  UserDto idCheck(String u_id);
  int register(UserDto userDto);
  int modify(UserDto userDto);
  int link1Modify(UserDto userDto);
  int link2Modify(UserDto userDto);
  int remove(int u_no);

}
