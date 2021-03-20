package com.giovani.serverdesafio.exceptions;

public class UpdateUserException extends Exception{

  /**
   *
   */
  private static final long serialVersionUID = -8625462867699908766L;

  public UpdateUserException() {
    super();
  }

  public UpdateUserException(String message) {
    super(message);
  }

  public UpdateUserException(Throwable cause) {
    super(cause);
  }

  public UpdateUserException(String message, Throwable cause) {
    super(message, cause);
  }

  public UpdateUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
