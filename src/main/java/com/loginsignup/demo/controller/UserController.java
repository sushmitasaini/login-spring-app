package com.loginsignup.demo.controller;

import java.util.HashMap;
import java.util.Map;

import com.loginsignup.demo.model.User;
import com.loginsignup.demo.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * UserController
 */
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public Map<String, Object> addUser(@RequestBody User newUser) {
        Map<String, Object> response = new HashMap<>();
        try {
            userRepository.save(newUser);
            response.put("success", Boolean.TRUE);
            response.put("result", newUser);
            return response;
        } catch (org.springframework.dao.DuplicateKeyException e) {
            response.put("success", Boolean.FALSE);
            response.put("error", "User Exist");
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            response.put("success", Boolean.FALSE);
            return response;
        }
    }

}