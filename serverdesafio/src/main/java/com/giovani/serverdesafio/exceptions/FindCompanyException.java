package com.giovani.serverdesafio.exceptions;

public class FindCompanyException extends Exception{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public FindCompanyException() {
  }

  public FindCompanyException(String message) {
    super(message);
  }

  public FindCompanyException(Throwable cause) {
    super(cause);
  }

  public FindCompanyException(String message, Throwable cause) {
    super(message, cause);
  }

  public FindCompanyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
  
}
