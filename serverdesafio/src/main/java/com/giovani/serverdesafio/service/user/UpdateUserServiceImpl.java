package com.giovani.serverdesafio.service.user;

import java.util.Optional;

import com.giovani.serverdesafio.exceptions.UpdateUserException;
import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.repository.UserRepository;
import com.giovani.serverdesafio.resource.user.UpdateUserRequest;
import com.giovani.serverdesafio.resource.user.UserResponse;
import com.giovani.serverdesafio.service.conversor.UserConversorImpl;
import com.giovani.serverdesafio.service.utils.ValidationUtilImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserServiceImpl {
  
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserConversorImpl userConversor;
  @Autowired
  private ValidationUtilImpl validation;

  public UserResponse update(UpdateUserRequest userRequest) throws UpdateUserException{
    Optional<User> opUser;
    User user;
    try{
      opUser = userRepository.findById(userRequest.getUserId());
      if(opUser.isPresent()){
        if(validation.isMailValid(userRequest.getMail())){
          user = opUser.get();
          user.setName(userRequest.getName());
          user.setMail(userRequest.getMail());
          user.setPassword(userRequest.getPassword());
          user.setLogin(userRequest.getLogin());
          user = userRepository.save(user);

          return userConversor.convertUser(user);
        }
        throw new UpdateUserException("user " + userRequest.getUserId() + " does not exist");
      }
      throw new UpdateUserException("mail address used");
    }catch(UpdateUserException ex){
      ex.printStackTrace();
      throw ex;
    }
  }

}
