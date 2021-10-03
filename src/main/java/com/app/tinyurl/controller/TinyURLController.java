package com.app.tinyurl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@RestController
@RequestMapping("/tinyurl")
public class TinyURLController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping
    public void testEndPoint(){
        try{
            log.info("In test end point;");
            this.jdbcTemplate.execute("SELECT 1 FROM DUAL;");
        } catch(Exception e) {
            log.error("Exception in testEndPoint "+e.getMessage());
            throw e;
        }

    }

}
