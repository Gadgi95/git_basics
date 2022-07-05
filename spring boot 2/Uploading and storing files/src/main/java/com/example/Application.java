package com.example;

import java.util.Collections;
import javax.servlet.MultipartConfigElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

@SpringBootApplication
public class Application {

  @Bean
  MultipartConfigElement multipartConfigElement() {
    MultipartConfigFactory factory = new MultipartConfigFactory();
    factory.setMaxFileSize(DataSize.ofKilobytes(512));
    factory.setMaxRequestSize(DataSize.ofKilobytes(512));
    return factory.createMultipartConfig();
  }


  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(Application.class);
    application.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
    application.run(args);
  }

}
