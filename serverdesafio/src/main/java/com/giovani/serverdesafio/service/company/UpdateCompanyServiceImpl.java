package com.giovani.serverdesafio.service.company;

import java.util.Optional;

import com.giovani.serverdesafio.exceptions.UpdateCompanyException;
import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.repository.CompanyRepository;
import com.giovani.serverdesafio.resource.company.CompanyResponse;
import com.giovani.serverdesafio.resource.company.UpdateCompanyRequest;
import com.giovani.serverdesafio.service.conversor.CompanyConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateCompanyServiceImpl {
  
  @Autowired
  private CompanyRepository companyRepository;
  @Autowired
  private CompanyConversorImpl companyConversor;

  public ResponseEntity<CompanyResponse> update(UpdateCompanyRequest companyRequest) throws UpdateCompanyException{
    Optional<Company> opCompany;
    Company company;
    CompanyResponse companyResponse;
    try{
      opCompany = companyRepository.findById(companyRequest.getCompanyId());
      if(opCompany.isPresent()){
        company = opCompany.get();

        company.setName(companyRequest.getName());
        company.setNameFantasy(companyRequest.getNameFatantasy());
        company.setPhone(companyRequest.getPhone());
        company.setMail(companyRequest.getMail());
        company.setDistrict(companyRequest.getDistrict());
        company.setStreet(companyRequest.getStreet());
        company.setNumberAddress(companyRequest.getNumberAddress());
        company.setComplement(companyRequest.getComplement());

        companyRepository.save(company);

        companyResponse = companyConversor.convertCompany(company);

        return new ResponseEntity<>(companyResponse, HttpStatus.OK);
      }
      throw new UpdateCompanyException("company " + companyRequest.getCompanyId() + " does not exist");
    }catch(UpdateCompanyException ex){
      ex.printStackTrace();
      throw ex;
    }
  }
}
