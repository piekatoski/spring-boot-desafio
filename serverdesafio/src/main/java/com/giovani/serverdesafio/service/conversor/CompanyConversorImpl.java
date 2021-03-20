package com.giovani.serverdesafio.service.conversor;

import com.giovani.serverdesafio.model.Company;
import com.giovani.serverdesafio.resource.company.CompanyResponse;
import com.giovani.serverdesafio.resource.company.ReceitaWsRequest;
import com.giovani.serverdesafio.resource.company.ReceitaWsResponse;
import com.giovani.serverdesafio.resource.company.RegisterCompanyRequest;
import com.giovani.serverdesafio.utils.FormatUtil;

import org.springframework.stereotype.Component;

@Component
public class CompanyConversorImpl {
  
  public CompanyResponse convertCompany(Company company){
    CompanyResponse companyResponse = new CompanyResponse();
    companyResponse.setCompanyId(company.getCompanyId());
    companyResponse.setName(company.getName());
    companyResponse.setCnpj(company.getCnpj());

    return companyResponse;
  }
  
  public Company convertRegisterCompany(RegisterCompanyRequest register){
    Company company = new Company();
    
    company.setCnpj(register.getCnpj());
    company.setComplement(register.getComplement());
    company.setDistrict(register.getDistrict());
    company.setDtopen(register.getDtopen());
    company.setLegalNature(register.getLegalNature());
    company.setMail(register.getMail());
    company.setName(register.getName());
    company.setNameFantasy(register.getNameFatantasy());
    company.setNumberAddress(register.getNumberAddress());
    company.setPhone(register.getPhone());
    company.setSituation(register.getSituation());
    company.setStreet(register.getStreet());
    company.setCity(register.getCity());
    company.setUf(register.getUf());
    
    return company;
  }



  public ReceitaWsResponse convertReceitaWs(ReceitaWsRequest receitaRequest){
    ReceitaWsResponse receitaRes = new ReceitaWsResponse();

    receitaRes.setName(receitaRequest.getNome());
    receitaRes.setNameFantasy(receitaRequest.getFantasia());
    receitaRes.setMail(receitaRequest.getEmail());
    receitaRes.setSituation(receitaRequest.getSituacao());
    receitaRes.setDistrict(receitaRequest.getBairro());
    receitaRes.setStreet(receitaRequest.getLogradouro());
    receitaRes.setComplement(receitaRequest.getComplemento());
    receitaRes.setLegalNature(receitaRequest.getNatureza_juridica());
    receitaRes.setCity(receitaRequest.getMunicipio());
    receitaRes.setUf(receitaRequest.getUf());

    receitaRes.setDtopen(FormatUtil.formataDate(receitaRequest.getAbertura()));
    receitaRes.setPhone(Long.parseLong(receitaRequest.getTelefone().replaceAll("[^0-9]", "")));
    receitaRes.setNumberAddress(Long.parseLong(receitaRequest.getNumero().replaceAll("[^0-9]", "")));
    receitaRes.setCnpj(Long.parseLong(receitaRequest.getCnpj().replaceAll("[^0-9]", "")));

    return receitaRes;
  }

}
