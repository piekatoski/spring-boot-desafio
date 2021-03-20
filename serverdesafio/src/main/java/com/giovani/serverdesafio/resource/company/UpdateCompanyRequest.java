package com.giovani.serverdesafio.resource.company;

public class UpdateCompanyRequest {
  
  private Long companyId;
  private String name;
  private String nameFatantasy;
  private Long phone;
  private String mail;
  private String district;
  private String street;
  private Integer numberAddress;
  private String complement;
  
  public UpdateCompanyRequest() {
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

  public String getNameFatantasy() {
    return nameFatantasy;
  }

  public void setNameFatantasy(String nameFatantasy) {
    this.nameFatantasy = nameFatantasy;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Integer getNumberAddress() {
    return numberAddress;
  }

  public void setNumberAddress(Integer numberAddress) {
    this.numberAddress = numberAddress;
  }

  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

}
