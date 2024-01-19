package com.afencode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    // TODO: Delete this controller. This is here for demonstration purposes
    @GetMapping("")
    public String helloUserController() {
        return "user access level";
    }

}
