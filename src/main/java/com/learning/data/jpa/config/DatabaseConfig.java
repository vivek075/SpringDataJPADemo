package com.learning.data.jpa.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:application.properties")
public class DatabaseConfig {

  @Value("${com.learning.data.jpa.jdbc.url}")      private String jdbcUrl;
  @Value("${com.learning.data.jpa.jdbc.user}")     private String user;
  @Value("${com.learning.data.jpa.jdbc.password}") private String password;
  @Value("${com.learning.data.jpa.packages}")      private String packages;

}