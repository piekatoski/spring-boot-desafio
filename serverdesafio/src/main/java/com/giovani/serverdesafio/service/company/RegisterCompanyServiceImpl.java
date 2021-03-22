package com.giovani.serverdesafio.service.company;

import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.resource.company.RegisterCompanyRequest;
import com.giovani.serverdesafio.service.conversor.CompanyConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Sevice to Register Company.
 * Valid required fields. 
 */
@Service
public class RegisterCompanyServiceImpl {
 
  @Autowired
  private CompanyRepository companyRepository;
  @Autowired
  private CompanyConversorImpl companyConversor;

  public void create(RegisterCompanyRequest companyRequest){
    Company company;
    try{
      company = companyConversor.convertRegisterCompany(companyRequest);
      companyRepository.saveAndFlush(company);
    }catch(Exception ex){
      ex.printStackTrace();
      throw ex;
    }
    
  }
  
}
