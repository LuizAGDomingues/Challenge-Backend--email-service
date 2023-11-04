package com.luiz.emailservice.application;

import com.luiz.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

  private final EmailSenderGateway emailSenderGateway;


  @Override
  public void sendEmail(String to, String subject, String body){}
  
}
