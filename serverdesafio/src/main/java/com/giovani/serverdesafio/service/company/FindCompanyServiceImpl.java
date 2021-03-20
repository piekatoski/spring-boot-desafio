package com.giovani.serverdesafio.service.company;

import java.util.ArrayList;
import java.util.List;

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

  public List<CompanyResponse> list(){
    List<CompanyResponse> companiesResponse = new ArrayList<>();
    List<Company> companies = companyRepository.findAll();
    companies.forEach(company -> companiesResponse.add(companyConversor.convertCompany(company)));

    return companiesResponse;
  }
  
  public CompanyResponse show(Long companyId){
    Company company = companyRepository.findById(companyId).get();

    return companyConversor.convertCompany(company);
  }
}
