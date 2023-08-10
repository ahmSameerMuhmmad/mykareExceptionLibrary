package com.mykare.service;

import com.mykare.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    public ResponseEntity<Object> checkLogin(String email, String password) throws ValidationException {
        if (email.equals("rehan") && password.equals("12345")){
            String response="{ \nstatus :"+HttpStatus.OK.name()+"\n"+
                             "statusCode :"+HttpStatus.OK.value()+"\n"+
                        "successMessage : Succesfully login\n}";
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else {
            throw new ValidationException("Not validated!");
        }
    }
}
