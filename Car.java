package com.example.myfirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @Autowired  // Dependencies in the injection and the other classes write the autowired the private . the field injection
    private Dog dog;

    @GetMapping("/Ok")
    public String ok(){
        return dog.fun();
    }

}
