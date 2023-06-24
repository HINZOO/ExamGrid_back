package com.gridvue.backend.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gridvue.backend.dto.UserDto;




@SpringBootTest
public class UserMapperTest {
  @Autowired
  private UserMapper userMapper;
  //private static UserDto user;
  @Test
  void testDeleteOne() {
    int delete = userMapper.deleteOne(21);
    System.out.println(delete);
  }

  @Test
  void testFindByAll() {
    List<UserDto> userList= userMapper.findByAll();
    System.out.println(userList);
  }

  @Test
  void testFindByUno() {
    
  }

  @Test
  void testInsertOne() {
    UserDto user=new UserDto();

    user.setU_id("test00");
    user.setUname("테스트");
    user.setGender("W");
    user.setNation("미국");
    user.setCity("LA");
    int insert=userMapper.insertOne(user);
    System.out.println(user+"등록"+insert);
  }

  @Test
  void testUpdateOne() {
    UserDto user=new UserDto();
    user.setU_no(21);
    user.setU_id("test22");
    user.setUname("테스트22");
    user.setGender("M");
    user.setNation("한국");
   // user.setCity("서울");
    int updateOne = userMapper.updateOne(user);
    System.out.println("수정"+updateOne+"//"+userMapper.findByUno(21));
  }
}
