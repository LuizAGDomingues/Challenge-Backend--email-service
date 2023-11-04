package com.luiz.emailservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luiz.emailservice.application.EmailSenderService;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
  private final EmailSenderService emailSenderService;

  @Autowired
  public EmailSenderController(EmailSenderService emailService){
    this.emailSenderService = emailService;
  };

  @PostMapping()
  public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request){
    try {
      this.emailSenderService.sendEmail(request.to, request.subject, null);
    } catch (Exception e) {
      // TODO: handle exception
    }
  };
}
