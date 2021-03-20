package com.giovani.serverdesafio.controller;

import com.giovani.serverdesafio.resource.company.ReceitaWsResponse;
import com.giovani.serverdesafio.service.company.CheckCNPJReceitaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
  
  @Autowired
  private CheckCNPJReceitaServiceImpl cnpjService;

  @GetMapping(path = "/{cnpj}")
  public ReceitaWsResponse checkCNPJ(@PathVariable(name = "cnpj", required = true) Long cnpj){
    return cnpjService.checkCNPJ(cnpj);
  }

}
