package com.giovani.serverdesafio.service.user;

import java.util.ArrayList;
import java.util.List;

import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.repository.UserRepository;
import com.giovani.serverdesafio.resource.user.UserResponse;
import com.giovani.serverdesafio.service.conversor.UserConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindUserServiceImpl {
  
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserConversorImpl userConversor;

  public List<UserResponse> list(){
    List<UserResponse> usersResponse = new ArrayList<>();
    List<User> users = userRepository.findAll();
    users.forEach(user -> usersResponse.add(userConversor.convertUser(user)));

    return usersResponse;
  }
  
  public UserResponse show(Long userId){
    User user = userRepository.findById(userId).get();

    return userConversor.convertUser(user);
  }
}
