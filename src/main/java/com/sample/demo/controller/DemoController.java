package com.sample.demo.controller;

import com.sample.demo.utility.TrackTime;
import com.sample.demo.utility.Measurable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController implements Measurable {

    @GetMapping
    @TrackTime
    public String helloAOP(){
        return "Welcome !! This method is Tracked using AOP and Timed";
    }

}
