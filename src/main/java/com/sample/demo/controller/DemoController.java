package com.sample.demo.controller;

import com.sample.demo.performance.TrackTime;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Timed
public class DemoController {

    @GetMapping("/hello")
    @TrackTime
    public String helloAOP(){
        return "Welcome !! This method is Tracked using AOP and Timed";
    }

}
