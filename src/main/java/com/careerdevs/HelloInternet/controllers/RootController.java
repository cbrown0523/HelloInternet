package com.careerdevs.HelloInternet.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    private String routeRoute(){
        return "You requested the root route";
    }

}
//HOW DID THE APP KNOW TO CALL THE METHOD ON THIS FILE VS,. THE FILE WITH MAIN METHOD
//TRY BONUS