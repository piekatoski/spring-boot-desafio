package com.giovani.serverdesafio.service.user;

import com.giovani.serverdesafio.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserServiceImpl {
  
  @Autowired
  private UserRepository userRepository;

  public void delete(Long id){
    userRepository.deleteById(id);
  }
}
