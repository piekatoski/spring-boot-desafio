package com.giovani.serverdesafio.exceptions;

public class UpdateCompanyException extends Exception{

  /**
   *
   */
  private static final long serialVersionUID = 4159424816003683677L;

  public UpdateCompanyException() {
    super();
  }

  public UpdateCompanyException(String message) {
    super(message);
  }

  public UpdateCompanyException(Throwable cause) {
    super(cause);
  }

  public UpdateCompanyException(String message, Throwable cause) {
    super(message, cause);
  }

  public UpdateCompanyException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  
  
}
