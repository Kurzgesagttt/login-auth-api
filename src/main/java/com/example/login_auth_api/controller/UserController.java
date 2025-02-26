package com.example.login_auth_api.controller;

import com.example.login_auth_api.domain.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        
    }
}
