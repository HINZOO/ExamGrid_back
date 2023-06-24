package com.gridvue.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gridvue.backend.dto.UserDto;

@Mapper
public interface UserMapper {
  //유저 조회 //유저 등록 //유저 수정 //유저 삭제 
  List<UserDto> findByAll();
  
  List<UserDto> findByAll(UserDto userDto);
  UserDto findByUno(int u_no);
  UserDto findByUId(String u_id);
  int insertOne(UserDto userDto);
  int updateOne(UserDto userDto);
  int deleteOne(int u_no);
}
