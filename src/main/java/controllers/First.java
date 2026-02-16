package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {

    @GetMapping("hello")
    public String hello(){
        return "welcome";
    }
}
