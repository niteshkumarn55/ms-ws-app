package com.softedge.solution.ws.mswsapp.controller;

import com.softedge.solution.ws.mswsapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping(path = "/{userId}")
    public User getUser(@PathVariable(name = "userId")String userId ){
        User user =  new User();
        user.setEmail("nitesh@growthenabler");
        user.setFirstName("Nitesh");
        user.setUserId(userId);
        return user;
    }

    @PostMapping
    public String createUser(){
        return "Create user was called";

    }

    @PutMapping
    public String updateUser(){
        return "Update user was called";

    }
    @DeleteMapping
    public String deleteUser(){
        return "Delete user was called";

    }

}
