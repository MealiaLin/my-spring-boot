package com.example.myspringboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "hello world示范接口")
@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @ApiOperation("hello world")
    @GetMapping
    public String helloWorld(){
        return "Hello world";
    }
}
