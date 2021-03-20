package com.giovani.serverdesafio.service.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.giovani.serverdesafio.exceptions.FindCompanyException;
import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.resource.company.CompanyResponse;
import com.giovani.serverdesafio.service.conversor.CompanyConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindCompanyServiceImpl {
  
  @Autowired
  private CompanyRepository companyRepository;
  @Autowired
  private CompanyConversorImpl companyConversor;

  public List<CompanyResponse> list() throws FindCompanyException{
    List<CompanyResponse> companiesResponse;
    List<Company> companies;
    try{
      companiesResponse = new ArrayList<>();
      companies = companyRepository.findAll();
      companies.forEach(company -> companiesResponse.add(companyConversor.convertCompany(company)));

      return companiesResponse; 
    }catch(Exception ex){
      ex.printStackTrace();
      throw new FindCompanyException("error find all companies", ex.getCause());
    }

    
  }
  
  public CompanyResponse show(Long companyId) throws FindCompanyException{
    Optional<Company> company;
    try{
      company = companyRepository.findById(companyId);
      if(company.isPresent()){
        return companyConversor.convertCompany(company.get());
      }
      throw new FindCompanyException("company " + companyId + " does not exist");
    }catch(FindCompanyException ex){
      ex.printStackTrace();
      throw ex;
    }

    
  }
}
