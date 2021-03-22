package com.giovani.serverdesafio.resource.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Class represents Request Update User.
 * Used Validation in fields requested
 * 
 */
public class UpdateUserRequest {

  @NotNull(message = "{id.user.not.blank}")
  private Long userId;
  @NotBlank(message = "{name.not.blank}")
  private String name;
  @NotBlank(message = "{mail.not.blank}")
  @Email(message = "{mail.not.valid}")
  private String mail;
  @NotBlank(message = "{login.user.not.blank}")
  private String login;
  @NotBlank(message = "{password.user.not.blank}")
  private String password;

  public UpdateUserRequest() {
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  } 

}
