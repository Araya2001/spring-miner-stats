package com.aajdev.springminerstats.controller;

import com.aajdev.springminerstats.service.GoogleCloudAuthService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/hello-world")
public class TestController {

  private final GoogleCloudAuthService googleCloudAuthService;

  @Autowired
  public TestController(GoogleCloudAuthService googleCloudAuthService) {
    this.googleCloudAuthService = googleCloudAuthService;
  }

  @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
  @ResponseBody
  public String helloWorld() {
    return "Hello world!";
  }

  @GetMapping(value = "/get-token", produces = MediaType.TEXT_PLAIN_VALUE)
  @ResponseBody
  public String getToken() {
    return googleCloudAuthService.getToken();
  }
}
