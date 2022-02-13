package com.springboot.crudoperation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
@RequestMapping("/general")
public class GeneralController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeAPI() {
        return new ResponseEntity<>("Welcome user", HttpStatus.OK);
    }
}
