package com.mykare.response;


import lombok.Getter;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor

public class ErrorResponse {
    private HttpStatus status;
    private  int statusCode;
    private  String errorMessage;



}
