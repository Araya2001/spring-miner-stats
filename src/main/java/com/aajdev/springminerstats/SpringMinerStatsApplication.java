package com.aajdev.springminerstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:environment.properties")
public class SpringMinerStatsApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringMinerStatsApplication.class, args);
  }
}
