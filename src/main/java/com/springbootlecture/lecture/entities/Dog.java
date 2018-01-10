package com.springbootlecture.lecture.entities;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Animal {
    private String name;


    public Dog() {
        System.out.println("Instantiating.");
    }

    @PostConstruct
    public void init(){
        System.out.println("Initialising");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
