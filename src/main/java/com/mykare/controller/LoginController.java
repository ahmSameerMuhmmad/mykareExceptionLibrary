package com.mykare.controller;

import com.mykare.exception.ValidationException;
import com.mykare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/check")
    public ResponseEntity<Object> checkLogin(@RequestParam String email,@RequestParam String password) throws ValidationException {
        return loginService.checkLogin(email, password);
    }
}
