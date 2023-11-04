package com.luiz.emailservice.core.exceptions;

public class EmailServiceException extends RuntimeException {
  public EmailServiceException(String message){
    super(message);
  }

  public EmailServiceException(String message, Throwable causa){
    super(message, cause);
  }
}
