package com.giovani.serverdesafio.resource.company;

import java.util.Date;

public class RegisterCompanyRequest {
  
  private String name;
  private String nameFatantasy;
  private Long phone;
  private String mail;
  private String situation;
  private String district;
  private String street;
  private Integer numberAddress;
  private String complement;
  private String cityId;
  private Date dtopen;
  private String legalNature;
  private Long cnpj;

  public RegisterCompanyRequest() {
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

  public String getSituation() {
    return situation;
  }

  public void setSituation(String situation) {
    this.situation = situation;
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

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public Date getDtopen() {
    return dtopen;
  }

  public void setDtopen(Date dtopen) {
    this.dtopen = dtopen;
  }

  public String getLegalNature() {
    return legalNature;
  }

  public void setLegalNature(String legalNature) {
    this.legalNature = legalNature;
  }

  public Long getCnpj() {
    return cnpj;
  }

  public void setCnpj(Long cnpj) {
    this.cnpj = cnpj;
  } 

}
