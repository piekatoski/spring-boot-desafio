package com.giovani.serverdesafio.service.utils;

import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Component with validations on entities 
 */
@Component
public class ValidationUtilImpl {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private CompanyRepository companyRepository;

  public Boolean isMailValid(String mail){
    return !userRepository.findByMail(mail).isPresent();
  }

  public Boolean isCompanyValid(Long companyId){
    return companyRepository.findById(companyId).isPresent();
  }

  
}
