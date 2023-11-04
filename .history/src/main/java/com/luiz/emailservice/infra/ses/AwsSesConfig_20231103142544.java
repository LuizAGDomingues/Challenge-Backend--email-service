package com.luiz.emailservice.infra.ses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

@Configuration
public class AwsSesConfig {

  @Value



  @Bean
  public AmazonSimpleEmailService amazonSimpleEmailService(){
    return AmazonSimpleEmailServiceClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
  }
}
