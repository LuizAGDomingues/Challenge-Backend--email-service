package com.luiz.emailservice.infra.ses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;

@Configuration
public class AwsSesConfig {
  @Bean
  public AmazonSimpleEmailService amazonSimpleEmailService(){
    return AmazonSimpleEmailService
  }
}
