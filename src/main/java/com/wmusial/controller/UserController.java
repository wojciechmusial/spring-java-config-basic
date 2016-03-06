package com.wmusial.controller;

import com.wmusial.model.User;
import com.wmusial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {


    private UserRepository userRepository;

    @RequestMapping("/users")
    public String userList(Model model) {
        List<User> users = userRepository.findAll();
        users.add(userRepository.findOne(1L));
        model.addAttribute("users", userRepository.findAll());

        return "user-list";
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
