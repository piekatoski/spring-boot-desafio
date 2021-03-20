package com.giovani.serverdesafio.service.user;

import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.repository.UserRepository;
import com.giovani.serverdesafio.resource.user.UpdateUserRequest;
import com.giovani.serverdesafio.resource.user.UserResponse;
import com.giovani.serverdesafio.service.conversor.UserConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserServiceImpl {
  
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserConversorImpl userConversor;

  public UserResponse update(UpdateUserRequest userRequest){
    User user = userRepository.findById(userRequest.getUserId()).get();
    user.setName(userRequest.getName());
    user.setMail(userRequest.getMail());
    user.setPassword(userRequest.getPassword());
    user.setLogin(userRequest.getLogin());
    user = userRepository.save(user);

    return userConversor.convertUser(user);
  }

}
