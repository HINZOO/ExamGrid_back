package com.gridvue.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gridvue.backend.dto.UserDto;

@Mapper
public interface UserMapper {
  //유저 조회 //유저 등록 //유저 수정 //유저 삭제 
  List<UserDto> findByAll();
  
  List<UserDto> findByAll(UserDto userDto);
  List<UserDto> searchByLink1();
  List<UserDto> searchByLink1(UserDto userDto);//Link 1번 검색
  UserDto findByUno(int u_no);
  UserDto findByUId(String u_id);
  int insertOne(UserDto userDto);
  int updateOne(UserDto userDto);
  int updateLink1(UserDto userDto);//Link1수정 
  int updateLink2(UserDto userDto);//Link2수정 //Link2는 한사람 정보이기 때문에 검색의 의미는 없음 수정만.
  int deleteOne(int u_no);
}
