package com.gridvue.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.gridvue.backend.dto.UserDto;
import com.gridvue.backend.service.UserService;

@RestController
public class UserController {
  
  @Autowired
  private UserService userService;

  @GetMapping("/api/list")
  public List<UserDto> getList(Model model) {
    List<UserDto> users= userService.list();
    return users;
  };

  @PostMapping("/api/list")
  public List<UserDto> SearchList(@RequestBody UserDto userDto) {
    List<UserDto> users= userService.list(userDto);
    return users;
  };
  
  @GetMapping("/api/link1/list")
  public List<UserDto> getListByLink1(Model model) {
    List<UserDto> users= userService.list1List();
    return users;
  };
  @PostMapping("/api/link1/list")
  public List<UserDto> SearchListByLink1(@RequestBody UserDto userDto) {
    List<UserDto> users= userService.link1List(userDto);
    return users;
  };

  @PostMapping("/api/user")
  public UserDto searchUser(@RequestBody UserDto userDto) {
      UserDto user = userService.detail(userDto.getU_no());
      return user;
  }

  
  @PostMapping("/api/insert")
  public int insertUser(@RequestBody UserDto userDto
                        ){
    //List<String> cityList = userDto.getCity();
   // String cities = String.join(",", cityList);
    int insert = userService.register(userDto);
    return insert;
}
  @PostMapping("/api/update")
   public int updateUser(@RequestBody UserDto userDto
                        ){
    int update= userService.modify(userDto);
    return update;
  }
  
  @PostMapping("/api/link1/update")
   public int updateUserLink1(@RequestBody UserDto userDto
                        ){
    int update= userService.link1Modify(userDto);
    return update;
  }

  @PostMapping("/api/link2/update")
   public int updateUserLink2(@RequestBody UserDto userDto
                        ){
    int update= userService.link2Modify(userDto);
    return update;
  }

  @PostMapping("/api/delete")
  public int deleteUser(@RequestBody String[] uNos) {
    int deleteUser = 0;
    for (String id : uNos) {
      int uNo = Integer.parseInt(id);
      deleteUser += userService.remove(uNo);
    }
    return deleteUser;
  }
  @PostMapping("/api/idcheck")
  public UserDto IdCheck(@RequestBody UserDto userDto) {
      UserDto user = userService.idCheck(userDto.getU_id());
      return user;
  }


}
