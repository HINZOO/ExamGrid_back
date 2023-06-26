package com.gridvue.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gridvue.backend.dto.UserDto;
import com.gridvue.backend.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  private UserMapper userMapper;

  @Override
  public List<UserDto> list() {
    List<UserDto> list= userMapper.findByAll();
    return list;
  }

  @Override
  public UserDto detail(int u_no) {
    UserDto detail = userMapper.findByUno(u_no);
    return detail;
  }

  @Override
  public int register(UserDto userDto) {
    int register = userMapper.insertOne(userDto);
    return register;
  }

  @Override
  public int modify(UserDto userDto) {
    int modify = userMapper.updateOne(userDto);
    return modify;
  }

  @Override
  public int remove(int u_no) {
    int remove = userMapper.deleteOne(u_no);
    return remove;
  }

  @Override
  public List<UserDto> list(UserDto userDto) {
   List<UserDto> list= userMapper.findByAll(userDto);
    return list;
  }

  @Override
  public UserDto idCheck(String u_id) {
    UserDto idCheck=userMapper.findByUId(u_id);
    return idCheck;
  }

  @Override
  public List<UserDto> list1List() {
    List<UserDto> list= userMapper.searchByLink1();
    return list;
  }

  @Override
  public List<UserDto> link1List(UserDto userDto) {
    List<UserDto> list= userMapper.searchByLink1(userDto);
    return list;
  }

  @Override
  public int link1Modify(UserDto userDto) {
    int link1Modify=userMapper.updateLink1(userDto);
    return link1Modify;
  }

  @Override
  public int link2Modify(UserDto userDto) {
    int link2Modify=userMapper.updateLink2(userDto);
    return link2Modify;
  }


  
}
