package com.giovani.serverdesafio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "user")
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;
  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "mail", nullable = false) 
  private String mail;
  @Column(name = "password", nullable = false) 
  private String password;
  @Column(name = "login", nullable = false) 
  private String login;
  @ManyToOne(optional = false)
  @JoinColumn(name = "companyId", referencedColumnName = "companyId") 
  private Company companyId;
  @Column(name= "dtregister", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtregister;
  @Column(name= "active", nullable = false)
  private Boolean active;
  
  
  public User() {
  }


  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getMail() {
    return mail;
  }


  public void setMail(String mail) {
    this.mail = mail;
  }


  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public Company getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Company companyId) {
    this.companyId = companyId;
  }


  public Date getDtregister() {
    return dtregister;
  }


  public void setDtregister(Date dtregister) {
    this.dtregister = dtregister;
  }


  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
    User other = (User) obj;
    if (userId == null) {
      if (other.userId != null)
        return false;
    } else if (!userId.equals(other.userId))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "User [active=" + active + ", companyId=" + companyId + ", dtregister=" + dtregister + ", login=" + login
        + ", mail=" + mail + ", name=" + name + ", password=" + password + ", userId=" + userId + "]";
  }

}
