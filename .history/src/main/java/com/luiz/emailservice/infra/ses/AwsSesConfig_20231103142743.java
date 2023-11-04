package com.luiz.emailservice.infra.ses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

@Configuration
public class AwsSesConfig {

  @Value("${aws.accessKeyId}")
  private String accessKeyId;
  @Value("${aws.secretKey}")
  private String secretKey;

  @Bean
  public AmazonSimpleEmailService amazonSimpleEmailService(){
    BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKeyId, secretKey);
    return AmazonSimpleEmailServiceClientBuilder
      .standard().withRegion(Regions.US_EAST_1)
      .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
      .build();
  }
}
