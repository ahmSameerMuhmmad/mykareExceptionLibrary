package com.mykare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class IOException  extends Exception{
    public String IOException()
    {
        return ("IO Exception occurred");
    }
}
