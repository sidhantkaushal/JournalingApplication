package com.engineeringdigest.journalApp;

import Test.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @Autowired
    private Dog dog;

    @GetMapping("/home")
    public String home() {
       return dog.eat();
    }

}
