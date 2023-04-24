package api.oracle.jpa.poc.api.oracle.jpa.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.oracle.jpa.poc.api.oracle.jpa.poc.entities.User;
import api.oracle.jpa.poc.api.oracle.jpa.poc.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        Iterable<User> users = userRepository.findAll();
        System.out.println(users);
        return users;
    }

    @PostMapping("/signup")
    public User postUser(@RequestBody User requestUser){
        User userSaved = userRepository.save(requestUser);
        return userSaved;
    }
}
