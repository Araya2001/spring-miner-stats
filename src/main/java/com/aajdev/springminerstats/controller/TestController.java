package com.aajdev.springminerstats.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/hello-world")
public class TestController {
  @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
  @ResponseBody
  public String helloWorld() {
    return "Hello World!";
  }
}
