package dev.rodrigoalexandre.mywebapi.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {

    @GetMapping
    public String welcome(){
        return  "Welcome to the Jungle  - My SpringbootAPI";
    }

}
