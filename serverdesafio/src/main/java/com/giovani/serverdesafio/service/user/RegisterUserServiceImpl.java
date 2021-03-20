package com.giovani.serverdesafio.service.user;

import com.giovani.serverdesafio.exceptions.RegisterUserException;
import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.model.User;
import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.repository.UserRepository;
import com.giovani.serverdesafio.resource.user.RegisterUserRequest;
import com.giovani.serverdesafio.service.conversor.UserConversorImpl;
import com.giovani.serverdesafio.service.utils.ValidationUtilImpl;

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
  @Autowired
  private ValidationUtilImpl validation;


  public void create(RegisterUserRequest userRequest) throws RegisterUserException{
    User user;
    Company company;
    try{
      user = userConversor.convertRegisterUser(userRequest);
      if(validation.isMailValid(user.getMail())){
        if(validation.isCompanyValid(userRequest.getCompanyId())){
          company = companyRepository.findById(userRequest.getCompanyId()).get();
          user.setCompanyId(company);
          userRepository.saveAndFlush(user);
        }else{
          throw new RegisterUserException("Company does not exist");
        }
      }else{
        throw new RegisterUserException("mail address used");
      }
    }catch(RegisterUserException ex){
      ex.printStackTrace();
    }

    
  }

}
