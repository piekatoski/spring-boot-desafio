package com.giovani.serverdesafio.exceptions;

public class DeleteUserException extends Exception{

  /**
   *
   */
  private static final long serialVersionUID = -3600311812371910407L;

  public DeleteUserException() {
    super();
  }

  public DeleteUserException(String message) {
    super(message);
  }

  public DeleteUserException(Throwable cause) {
    super(cause);
  }

  public DeleteUserException(String message, Throwable cause) {
    super(message, cause);
  }

  public DeleteUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
  
  

}
