package com.giovani.serverdesafio.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name= "city")
public class City {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long cityId;
  @Column(nullable = false, name = "name")
  private String name;
  @ManyToOne(optional = false)
  @JoinColumn(name = "ufId", referencedColumnName = "ufId")
  private Uf ufId;
  @OneToMany(targetEntity = Company.class, mappedBy = "cityId", fetch = FetchType.LAZY)
  private Collection<Company> companyCollection;
  
  public City() {
  }


  public Long getCityId() {
    return cityId;
  }


  public void setCityId(Long cityId) {
    this.cityId = cityId;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Uf getUfId() {
    return ufId;
  }


  public void setUfId(Uf ufId) {
    this.ufId = ufId;
  }
  

  public Collection<Company> getCompanyCollection() {
    return companyCollection;
  }


  public void setCompanyCollection(Collection<Company> companyCollection) {
    this.companyCollection = companyCollection;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
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
    City other = (City) obj;
    if (cityId == null) {
      if (other.cityId != null)
        return false;
    } else if (!cityId.equals(other.cityId))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "City [cityId=" + cityId + ", name=" + name + ", ufId=" + ufId + "]";
  }
  
}
