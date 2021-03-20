package com.giovani.serverdesafio.resource.user;

public class RegisterUserRequest {
  
  private String name;
  private String mail;
  private String login;
  private String password;
  private Long companyId;
  
  
  public RegisterUserRequest() {
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


  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }  

}
