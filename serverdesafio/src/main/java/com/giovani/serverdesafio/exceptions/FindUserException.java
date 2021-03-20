package com.giovani.serverdesafio.exceptions;

public class FindUserException extends Exception{

  /**
   *
   */
  private static final long serialVersionUID = -6084446471466759588L;

  public FindUserException() {
    super();
  }

  public FindUserException(String message) {
    super(message);
  }

  public FindUserException(Throwable cause) {
    super(cause);
  }

  public FindUserException(String message, Throwable cause) {
    super(message, cause);
  }

  public FindUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
  
}
