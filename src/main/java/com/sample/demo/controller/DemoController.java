package com.sample.demo.controller;

import com.sample.demo.performance.TimeTrack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    @TimeTrack
    public String hello(){
        return "Welcome !!";
    }
}
