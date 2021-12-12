package com.user.controller;

import com.user.model.User;
import com.user.services.UserServicesImpl;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

   @Autowired
   private UserServicesImpl userServices;

   @PostMapping("/save")
   public User getUser(@RequestBody  User user){
       return userServices.createUser(user);
   }

   @GetMapping("/get")
   public List<User> getAll(){
      return userServices.getUser();
   }

   @GetMapping("/get/{id}")
   public User getById(@PathVariable long id){
      return userServices.getUserById(id);
   }


   @DeleteMapping("/del/{id}")
   public String deleteById(@PathVariable long id){
      userServices.deleteById(id);
     return "Successfully Delete Id ";
   }

   @GetMapping("/update")
   public User updateUser(@RequestBody User user){
           return userServices.updateUser(user);
   }
}
