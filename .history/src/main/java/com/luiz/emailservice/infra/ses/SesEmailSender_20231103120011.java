package com.luiz.emailservice.infra.ses;

import org.springframework.beans.factory.annotation.Autowired;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.luiz.emailservice.adapters.EmailSenderGateway;

public class SesEmailSender implements EmailSenderGateway {
  
  private final AmazonSimpleEmailService amazonSimpleEmailService;

  @Autowired
  public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
    this.amazonSimpleEmailService = amazonSimpleEmailService;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    SendEmailRequest request = new SendEmailRequest()
    .withSource("luizdomingues.contato@gmail.com")
    .withDestination(new Destination());
  }
  
}
