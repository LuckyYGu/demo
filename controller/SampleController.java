package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lucky on 2018/11/28.
 */
@RestController
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}