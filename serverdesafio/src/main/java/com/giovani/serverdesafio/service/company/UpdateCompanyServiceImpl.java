package com.giovani.serverdesafio.service.company;

import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.resource.company.CompanyResponse;
import com.giovani.serverdesafio.resource.company.UpdateCompanyRequest;
import com.giovani.serverdesafio.service.conversor.CompanyConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateCompanyServiceImpl {
  
  @Autowired
  private CompanyRepository companyRepository;
  @Autowired
  private CompanyConversorImpl companyConversor;

  public CompanyResponse update(UpdateCompanyRequest companyRequest){
    Company company = companyRepository.findById(companyRequest.getCompanyId()).get();
    
    company.setName(companyRequest.getName());
    company.setNameFantasy(companyRequest.getNameFatantasy());
    company.setPhone(companyRequest.getPhone());
    company.setMail(companyRequest.getMail());
    company.setDistrict(companyRequest.getDistrict());
    company.setStreet(companyRequest.getStreet());
    company.setNumberAddress(companyRequest.getNumberAddress());
    company.setComplement(companyRequest.getComplement());

    return companyConversor.convertCompany(company);
  }
}
