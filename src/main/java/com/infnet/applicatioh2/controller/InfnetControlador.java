package com.infnet.applicatioh2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/infnet")
public class InfnetControlador {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
