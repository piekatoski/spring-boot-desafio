package com.giovani.serverdesafio.service.company;

import com.giovani.serverdesafio.resource.company.ReceitaWsRequest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Service Request to API External
 * Used Feign for communication
 */
@FeignClient(url = "https://receitaws.com.br/v1/cnpj/", name = "receitaws")
public interface ReceitaService {
  
  @GetMapping("{cnpj}")
  ReceitaWsRequest findCNPJ(@PathVariable("cnpj") Long cnpj); 

}
