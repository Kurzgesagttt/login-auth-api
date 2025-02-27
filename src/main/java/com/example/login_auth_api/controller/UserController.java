package com.example.login_auth_api.controller;

import com.example.login_auth_api.domain.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getUser(){
        return ResponseEntity.ok("Sucesso!");
    }
}
