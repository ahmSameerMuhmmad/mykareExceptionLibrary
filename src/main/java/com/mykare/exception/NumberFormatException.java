package com.mykare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class NumberFormatException extends Exception {

    public int  NumberFormatException()
    {
        String invalidNumber = "abc";
        return Integer.parseInt(invalidNumber);
    }
}
