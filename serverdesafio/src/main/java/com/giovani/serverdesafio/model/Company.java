package com.giovani.serverdesafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Collection;
import java.util.Date;


@Entity(name= "company")
public class Company {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long companyId;
  @Column(name = "name")
  private String name;
  @Column(name = "name_fantasy")
  private String nameFantasy;
  @Column(name = "phone")
  private Long phone;
  @Column(name = "mail")
  private String mail;
  @Column(name = "situation")
  private String situation;
  @Column(name = "district")
  private String district;
  @Column(name = "street")
  private String street;
  @Column(name = "numerAddress")
  private Integer numberAddress;
  @Column(name = "complement")
  private String complement;
  @ManyToOne
  @JoinColumn(name = "cityId", referencedColumnName = "cityId")
  private City cityId;
  @Column(name = "dtopen")
  @Temporal(TemporalType.DATE)
  private Date dtopen;
  @Column(name = "legal_nature")
  private String legalNature;
  @Column(name = "cnpj", nullable = false)
  private Long cnpj;
  @Column(name = "dtregister", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtregister;
  @OneToMany(targetEntity = User.class, mappedBy = "companyId", fetch = FetchType.LAZY)
  private Collection<User> userCollection;
  
  
  public Company() {
  }

  public Company(Long companyId) {
    this.companyId = companyId;
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


  public String getNameFantasy() {
    return nameFantasy;
  }


  public void setNameFantasy(String nameFantasy) {
    this.nameFantasy = nameFantasy;
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


  public City getCityId() {
    return cityId;
  }


  public void setCityId(City cityId) {
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


  public Date getDtregister() {
    return dtregister;
  }


  public void setDtregister(Date dtregister) {
    this.dtregister = dtregister;
  }


  public Collection<User> getUserCollection() {
    return userCollection;
  }


  public void setUserCollection(Collection<User> userCollection) {
    this.userCollection = userCollection;
  }  


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Company other = (Company) obj;
    if (companyId == null) {
      if (other.companyId != null)
        return false;
    } else if (!companyId.equals(other.companyId))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "Company [cityId=" + cityId + ", cnpj=" + cnpj + ", companyId=" + companyId + ", complement=" + complement
        + ", district=" + district + ", dtopen=" + dtopen + ", dtregister=" + dtregister + ", legalNature="
        + legalNature + ", mail=" + mail + ", name=" + name + ", nameFantasy=" + nameFantasy + ", numberAddress="
        + numberAddress + ", phone=" + phone + ", situation=" + situation + ", street=" + street + "]";
  }
  
}
