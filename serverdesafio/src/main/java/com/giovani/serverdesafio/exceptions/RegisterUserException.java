package com.giovani.serverdesafio.exceptions;

public class RegisterUserException extends Exception{

  /**
   *
   */
  private static final long serialVersionUID = -6377476261645040352L;

  public RegisterUserException() {
    super();
  }

  public RegisterUserException(String message) {
    super(message);
  }

  public RegisterUserException(Throwable cause) {
    super(cause);
  }

  public RegisterUserException(String message, Throwable cause) {
    super(message, cause);
  }

  public RegisterUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
