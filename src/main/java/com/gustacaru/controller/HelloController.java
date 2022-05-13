package com.gustacaru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

  @GetMapping
  public @ResponseBody String hello() {
    return "Bem vindo ao teste tecnico de Gustavo Caruso para Zappts. Consulte a documentação: https://github.com/gusttavocaruso/magic-api";
  }

}
