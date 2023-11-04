package com.luiz.emailservice.infra.ses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.luiz.emailservice.adapters.EmailSenderGateway;
import com.luiz.emailservice.core.exceptions.EmailServiceException;

@Service
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
      .withDestination(new Destination().withToAddresses(to))
      .withMessage(new Message()
        .withSubject(new Content(subject))
        .withBody(new Body().withText(new Content(body)))
    );
    try {
      this.amazonSimpleEmailService.sendEmail(request);
    } catch (AmazonServiceException e) {
      throw new EmailServiceException("Failure while sending email", e);
    }
  }
  
}
