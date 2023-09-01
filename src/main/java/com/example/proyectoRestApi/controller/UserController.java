package com.example.proyectoRestApi.controller;

import com.example.proyectoRestApi.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user){
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){

    }
}
