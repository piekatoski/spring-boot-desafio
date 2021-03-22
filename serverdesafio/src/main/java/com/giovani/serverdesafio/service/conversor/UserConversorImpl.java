package com.giovani.serverdesafio.service.conversor;

import java.util.Date;

import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.resource.user.RegisterUserRequest;
import com.giovani.serverdesafio.resource.user.UserResponse;

import org.springframework.stereotype.Component;

/**
 * Componet to converter Entity User in classes Request, Response
 */
@Component
public class UserConversorImpl {
  
  public User convertRegisterUser(RegisterUserRequest userRequest){
    User user = new User();

    user.setName(userRequest.getName());
    user.setMail(userRequest.getMail());
    user.setLogin(userRequest.getLogin());
    user.setPassword(userRequest.getPassword());
    user.setActive(Boolean.TRUE);
    user.setDtregister(new Date());

    return user;
  }

  public UserResponse convertUser(User user){
    UserResponse userResponse = new UserResponse();

    userResponse.setUserId(user.getUserId());
    userResponse.setActive(user.getActive());
    userResponse.setCompanyId(user.getCompanyId().getCompanyId());
    userResponse.setDtregister(user.getDtregister());
    userResponse.setLogin(user.getLogin());
    userResponse.setMail(user.getMail());
    userResponse.setName(user.getName());

    return userResponse;
  }
 

}
