package com.luiz.emailservice.infra.ses;

import org.springframework.beans.factory.annotation.Autowired;

import com.luiz.emailservice.adapters.EmailSenderGateway;

public class SesEmailSender implements EmailSenderGateway {
  
  private final AmazonSimpleEmailService amazonSimpleEmailService;

  @Autowired
  public SesEmailSender(){
    this.amazonSimpleEmailService = ama
  }

  @Override
  public void sendEmail(String to, String subject, String body) {

  }
  
}
