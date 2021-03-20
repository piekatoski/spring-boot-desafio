package com.giovani.serverdesafio.controller;

import java.util.List;

import com.giovani.serverdesafio.resource.user.RegisterUserRequest;
import com.giovani.serverdesafio.resource.user.UpdateUserRequest;
import com.giovani.serverdesafio.resource.user.UserResponse;
import com.giovani.serverdesafio.service.user.DeleteUserServiceImpl;
import com.giovani.serverdesafio.service.user.FindUserServiceImpl;
import com.giovani.serverdesafio.service.user.RegisterUserServiceImpl;
import com.giovani.serverdesafio.service.user.UpdateUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  private RegisterUserServiceImpl registerUserService;
  @Autowired
  private FindUserServiceImpl findUserService;
  @Autowired
  private DeleteUserServiceImpl deleteUserService;
  @Autowired
  private UpdateUserServiceImpl updateUserService;

  @PostMapping(path = "/")
  public void create(@RequestBody RegisterUserRequest user){
    registerUserService.create(user);
  }
  
  @GetMapping(path = "/")
  public List<UserResponse> list(){
    return findUserService.list();
  }
  
  @GetMapping(path = "/{id}")
  public UserResponse show(@PathVariable(name = "id", required = true) Long id){
    return findUserService.show(id);
  }
  
  @DeleteMapping(path = "/{id}")
  public void delete(@PathVariable(name = "id", required = true) Long id){
    deleteUserService.delete(id);
  }

  @PutMapping(path = "/")
  public UserResponse update(@RequestBody UpdateUserRequest user){
    return updateUserService.update(user);
  }

}
