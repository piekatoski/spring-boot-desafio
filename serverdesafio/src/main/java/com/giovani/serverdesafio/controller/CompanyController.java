package com.giovani.serverdesafio.controller;

import java.util.List;

import javax.validation.Valid;

import com.giovani.serverdesafio.exceptions.FindCompanyException;
import com.giovani.serverdesafio.exceptions.UpdateCompanyException;
import com.giovani.serverdesafio.resource.company.CompanyResponse;
import com.giovani.serverdesafio.resource.company.ReceitaWsResponse;
import com.giovani.serverdesafio.resource.company.RegisterCompanyRequest;
import com.giovani.serverdesafio.resource.company.UpdateCompanyRequest;
import com.giovani.serverdesafio.service.company.CheckCNPJReceitaServiceImpl;
import com.giovani.serverdesafio.service.company.FindCompanyServiceImpl;
import com.giovani.serverdesafio.service.company.RegisterCompanyServiceImpl;
import com.giovani.serverdesafio.service.company.UpdateCompanyServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class Company Controller
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
  
  @Autowired
  private CheckCNPJReceitaServiceImpl cnpjService;
  @Autowired
  private RegisterCompanyServiceImpl registerService;
  @Autowired
  private FindCompanyServiceImpl findService;
  @Autowired
  private UpdateCompanyServiceImpl updateService;

  /**
   * method check CNPJ.
   * return information in json
   * @param cnpj
   * @return
   */
  @GetMapping(path = "/cnpj/{cnpj}")
  public ReceitaWsResponse checkCNPJ(@PathVariable(name = "cnpj", required = true) Long cnpj){
    return cnpjService.checkCNPJ(cnpj);
  }

  @PostMapping(path = "/")
  public ResponseEntity create(@RequestBody @Valid RegisterCompanyRequest company){
    try {
      registerService.create(company);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping(path = "/")
  public ResponseEntity<List<CompanyResponse>> list(){
    try {
      return findService.list();
    } catch (FindCompanyException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<CompanyResponse> show(@PathVariable(name = "id", required = true) Long id){
    try {
      return findService.show(id);
    } catch (FindCompanyException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping(path = "/")
  public ResponseEntity<CompanyResponse> update(@RequestBody @Valid UpdateCompanyRequest company){
    try {
      return updateService.update(company);
    } catch (UpdateCompanyException e) {
      e.printStackTrace();
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
