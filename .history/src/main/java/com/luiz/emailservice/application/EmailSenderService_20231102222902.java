package com.luiz.emailservice.application;
import org.springframework.beans.factory.annotation.Autowired;
import com.luiz.emailservice.core.EmailSenderUseCase;

public class EmailSenderService<EmailSenderGateway> implements EmailSenderUseCase {

  private final EmailSenderGateway emailSenderGateway;

  @Autowired
  public EmailSenderService(EmailSenderGateway emailGateway){
    this.emailSenderGateway = emailGateway
  }

  @Override
  public void sendEmail(String to, String subject, String body){}
  
}
