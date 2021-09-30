package com.app.tinyurl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/tinyurl")
public class TinyURLController {

    @GetMapping
    public void testEndPoint(){
      log.info("In test end point; testing logback using lombok");
    }

}
