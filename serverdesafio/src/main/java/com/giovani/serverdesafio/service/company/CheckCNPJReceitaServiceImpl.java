package com.giovani.serverdesafio.service.company;

import com.giovani.serverdesafio.resource.company.ReceitaWsResponse;
import com.giovani.serverdesafio.service.conversor.CompanyConversorImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Sevice to check CNPJ company in Receita.
 */
@Service
public class CheckCNPJReceitaServiceImpl {
  
  @Autowired
  private ReceitaService receitaService;
  @Autowired
  private CompanyConversorImpl companyConversor;

  public ReceitaWsResponse checkCNPJ(Long cnpj){
    return companyConversor.convertReceitaWs(receitaService.findCNPJ(cnpj));
  }

}
