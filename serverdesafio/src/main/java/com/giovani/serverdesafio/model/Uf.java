package com.giovani.serverdesafio.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name = "uf")
public class Uf {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ufId;
  @Column(nullable = false, length = 2, name = "sigla")
  private String sigla;
  @Column(nullable = false, name = "name")
  private String name;
  @OneToMany(targetEntity = City.class, mappedBy = "ufId", fetch = FetchType.LAZY)
  private Collection<City> citiesCollection;
  
  public Uf() {
  }

  public Long getUfId() {
    return ufId;
  }

  public void setUfId(Long ufId) {
    this.ufId = ufId;
  }

  public String getSigla() {
    return sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Collection<City> getCitiesCollection() {
    return citiesCollection;
  }

  public void setCitiesCollection(Collection<City> citiesCollection) {
    this.citiesCollection = citiesCollection;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((ufId == null) ? 0 : ufId.hashCode());
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
    Uf other = (Uf) obj;
    if (ufId == null) {
      if (other.ufId != null)
        return false;
    } else if (!ufId.equals(other.ufId))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Uf [name=" + name + ", sigla=" + sigla + ", ufId=" + ufId + "]";
  }

}
