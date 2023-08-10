package com.mykare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AlreadyExistException extends Exception{

    public AlreadyExistException(String message)
    {
        super(message);

    }
}

