package com.giovani.serverdesafio.service.user;

import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.repository.UserRepository;
import com.giovani.serverdesafio.resource.user.RegisterUserRequest;
import com.giovani.serverdesafio.service.conversor.UserConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserServiceImpl {
  
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private CompanyRepository companyRepository;
  @Autowired
  private UserConversorImpl userConversor;


  public void create(RegisterUserRequest userRequest){
    User user = userConversor.convertRegisterUser(userRequest);
    Company company = companyRepository.findById(userRequest.getCompanyId()).get();
    user.setCompanyId(company);
    userRepository.saveAndFlush(user);
  }

}
