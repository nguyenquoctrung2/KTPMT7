package vn.edu.iuh.fit.usermanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.usermanagement.models.User;
import vn.edu.iuh.fit.usermanagement.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }
}
