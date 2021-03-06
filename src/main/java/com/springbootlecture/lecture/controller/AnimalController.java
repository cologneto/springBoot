package com.springbootlecture.lecture.controller;

import com.springbootlecture.lecture.entities.Animal;
import com.springbootlecture.lecture.entities.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalController {

    @Autowired
    private Animal dog;

    @GetMapping("/dog2")
    @ResponseBody
    public String getAnimal(){
        return dog.getName();
    }


}
