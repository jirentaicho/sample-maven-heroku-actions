package com.example.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hasira {
    private String name;
    public String getInfo(){
        return this.name + " : sama";
    }
}
