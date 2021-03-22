package com.giovani.serverdesafio.service.user;

import java.util.Optional;

import com.giovani.serverdesafio.exceptions.DeleteUserException;
import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Sevice to Delete User.
 * Valid required fields. 
 */
@Service
public class DeleteUserServiceImpl {
  
  @Autowired
  private UserRepository userRepository;

  public void delete(Long id) throws DeleteUserException{
    Optional<User> opUser;
    try{
      opUser = userRepository.findById(id);
      if(opUser.isPresent()){
        userRepository.deleteById(id);
      }
      throw new DeleteUserException("user " + id + " does not exist");
    }catch(DeleteUserException ex){
      ex.printStackTrace();
    } 

    
  }
}
