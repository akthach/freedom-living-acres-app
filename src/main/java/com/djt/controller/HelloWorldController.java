package com.djt.controller;

import org.springframework.web.bind.annotation.*;

import static java.lang.String.format;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping(value = "/{personName}")
    public String greet(@PathVariable(value = "personName") String name) {
        return format("Hello %s!", name);
    }

}
