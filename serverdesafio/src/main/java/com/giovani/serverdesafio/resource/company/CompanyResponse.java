package com.giovani.serverdesafio.resource.company;

/**
 * Class represents Response Company.
 * 
 */
public class CompanyResponse {
  
  private Long companyId;
  private String name;
  private Long cnpj;
  
  public CompanyResponse() {
  }

  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCnpj() {
    return cnpj;
  }

  public void setCnpj(Long cnpj) {
    this.cnpj = cnpj;
  }
  
}
