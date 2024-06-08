package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class DummyController {
 @RequestMapping("/")
 public String displaydefaultmessage() {
     return "Hello hello";
 }
    
}
