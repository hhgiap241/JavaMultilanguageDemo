package com.example.demomultilanguage;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {
  @GetMapping("/hello")
  public String hello() {
    return MessageSourceUtil.getContent(MESSAGE.hello);
  }
}
