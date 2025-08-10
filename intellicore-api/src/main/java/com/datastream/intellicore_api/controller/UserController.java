package com.datastream.intellicore_api.controller;

import com.datastream.intellicore_api.entity.User;
import com.datastream.intellicore_api.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private userService userservice;

    @GetMapping("/getall")
    public List<User> getAll(){
        return userservice.Getall();
    }
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        User checkuser=userservice.Storeuser(user);
        if(checkuser==null) {
            return ResponseEntity.status(409).body("User Creation Failed. User Already Exists");
        }
        return ResponseEntity.ok("User Created");
    }
}
