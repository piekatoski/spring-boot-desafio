package com.giovani.serverdesafio.controller;

import java.util.List;

import javax.validation.Valid;

import com.giovani.serverdesafio.exceptions.DeleteUserException;
import com.giovani.serverdesafio.exceptions.FindUserException;
import com.giovani.serverdesafio.exceptions.RegisterUserException;
import com.giovani.serverdesafio.exceptions.UpdateUserException;
import com.giovani.serverdesafio.resource.user.RegisterUserRequest;
import com.giovani.serverdesafio.resource.user.UpdateUserRequest;
import com.giovani.serverdesafio.resource.user.UserResponse;
import com.giovani.serverdesafio.service.user.DeleteUserServiceImpl;
import com.giovani.serverdesafio.service.user.FindUserServiceImpl;
import com.giovani.serverdesafio.service.user.RegisterUserServiceImpl;
import com.giovani.serverdesafio.service.user.UpdateUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity create(@RequestBody @Valid RegisterUserRequest user){
    try {
      registerUserService.create(user);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (RegisterUserException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  
  @GetMapping(path = "/")
  public ResponseEntity<List<UserResponse>> list(){
    try {
      return findUserService.list();
    } catch (FindUserException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  
  @GetMapping(path = "/{id}")
  public ResponseEntity<UserResponse> show(@PathVariable(name = "id", required = true) Long id){
    try {
      return findUserService.show(id);
    } catch (FindUserException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  
  @DeleteMapping(path = "/{id}")
  public ResponseEntity delete(@PathVariable(name = "id", required = true) Long id){
    try {
      deleteUserService.delete(id);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (DeleteUserException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping(path = "/")
  public ResponseEntity<UserResponse> update(@RequestBody @Valid UpdateUserRequest user){
    try {
      return updateUserService.update(user);
    } catch (UpdateUserException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
