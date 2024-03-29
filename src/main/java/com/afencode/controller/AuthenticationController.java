package com.afencode.controller;

import org.springframework.web.bind.annotation.RestController;

import com.afencode.model.ApplicationUser;
import com.afencode.model.LoginResponseDTO;
import com.afencode.model.RegistrationDTO;
import com.afencode.service.AuthenticationService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {
    
    private AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body) {
        
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body) { // TODO: create LoginDTO and use it
        
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
    
}
