package edu.mim.subsription.controller;

import edu.mim.subsription.model.User;
import edu.mim.subsription.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User add(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
       return userService.findById(id);
    }
}
