package com.luiz.emailservice.application;
import org.springframework.beans.factory.annotation.Autowired;

import com.luiz.emailservice.adapters.EmailSenderGateway;
import com.luiz.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

  @Autowired
  public EmailSenderService(EmailSenderGateway emailGateway){
  }

  @Override
  public void sendEmail(String to, String subject, String body){}
  
}
