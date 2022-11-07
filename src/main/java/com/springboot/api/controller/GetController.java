package com.springboot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/get-api")
public class GetController {

    @GetMapping(value = "/name")
    public String getName() {
        return "Flature";
    }

}
