package com.luiz.emailservice.infra.ses;

import com.luiz.emailservice.adapters.EmailSenderGateway;

public class SesEmailSender implements EmailSenderGateway {
  
  private final AmazonSimpleEmailService amazonSimpleEmailService;

  @aut

  @Override
  public void sendEmail(String to, String subject, String body) {

  }
  
}
