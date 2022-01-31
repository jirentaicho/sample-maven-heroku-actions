package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/sample")
    public String sample(){
        Hasira hasira = new Hasira("uzui");
        return hasira.getInfo();
    }
}
