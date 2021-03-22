package com.giovani.serverdesafio.resource.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;

/**
 * Class represents Request register User.
 * Used Validation in fields requested
 * 
 */
public class RegisterUserRequest {
  
  @NotBlank(message = "{name.not.blank}")
  private String name;
  @NotBlank(message = "{mail.not.blank}")
  @Email(message = "{mail.not.valid}")
  private String mail;
  @NotBlank(message = "{login.user.not.blank}")
  private String login;
  @NotBlank(message = "{password.user.not.blank}")
  private String password;
  @NotNull(message = "{id.company.not.null}")
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
