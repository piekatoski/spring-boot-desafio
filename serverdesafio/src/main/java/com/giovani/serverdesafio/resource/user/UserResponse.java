package com.giovani.serverdesafio.resource.user;

import java.util.Date;

/**
 * Class represents Response User.
 * 
 */
public class UserResponse {
  
  private Long userId;
  private String name;
  private String mail;
  private String login;
  private Long companyId;
  private Date dtregister;
  private Boolean active;
  
  public UserResponse() {
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

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
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

}
