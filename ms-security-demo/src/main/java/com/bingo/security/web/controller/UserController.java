package com.bingo.security.web.controller;

import com.bingo.security.domain.User;
import com.bingo.security.exception.UserNotExistException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengb
 * @date 2019/5/23 14:22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User getUser(@RequestParam Integer id){
        throw new UserNotExistException(1);
    }
}
