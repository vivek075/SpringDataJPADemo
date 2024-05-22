package com.learning.data.jpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.learning.data.jpa")
@EnableJpaRepositories("com.learning.data.jpa")
@Import(OrmConfig.class)
public class RepositoryConfig {

}