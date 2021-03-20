package com.giovani.serverdesafio.service.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.giovani.serverdesafio.exceptions.FindUserException;
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

  public List<UserResponse> list() throws FindUserException{
    List<UserResponse> usersResponse;
    List<User> users;
    try{
      usersResponse = new ArrayList<>();
      users = userRepository.findAll();
      users.forEach(user -> usersResponse.add(userConversor.convertUser(user)));
      
      return usersResponse;
    }catch(Exception ex){
      throw new FindUserException("error find all users", ex.getCause());
    }
  }
  
  public UserResponse show(Long userId) throws FindUserException{
    Optional<User> user;
    try{
      user = userRepository.findById(userId);
      if(user.isPresent()){
        return userConversor.convertUser(user.get());
      }
      throw new FindUserException("user " + userId + " does not exist");
    }catch(FindUserException ex){
      ex.printStackTrace();
      throw ex;
    }
  }
}
