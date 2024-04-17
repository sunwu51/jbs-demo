package com.example.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


/**
 * @author Frank
 * @date 2023/12/16 12:50
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") int id) {
        User u = userRepo.getUserById(id);
        UserDto result = new UserDto();
        result.setId(u.getId());
        result.setName(u.getName());
        return result;
    }
}


