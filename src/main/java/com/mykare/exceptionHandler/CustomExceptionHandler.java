package com.mykare.exceptionHandler;


import com.mykare.exception.*;
import com.mykare.exception.NullPointerException;
import com.mykare.exception.NumberFormatException;
import com.mykare.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AlreadyExistException.class)
    public ResponseEntity<ErrorResponse> handleAlreadyExistException(AlreadyExistException ex, WebRequest request)
    {
        ErrorResponse errorResponse=new ErrorResponse(HttpStatus.ALREADY_REPORTED,HttpStatus.ALREADY_REPORTED.value(),ex.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.ALREADY_REPORTED);
    }

   @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ErrorResponse>handlerResourceNotFoundHandler(ResourceNotFoundException ex, WebRequest request)
   {
    ErrorResponse errorResponse=new ErrorResponse(HttpStatus.NOT_FOUND,HttpStatus.NOT_FOUND.value(),ex.getMessage());

    return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(ValidationException.class)
   public ResponseEntity<ErrorResponse>handlerValidationException(ValidationException ex,WebRequest request)
   {
       ErrorResponse errorResponse=new ErrorResponse(HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.value(), ex.getMessage());
       return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(UnauthorizedAccessException.class)
   public ResponseEntity<Object>handlerUnauthorizedAccessException(UnauthorizedAccessException ex, WebRequest request){
        ErrorResponse errorResponse=new ErrorResponse(HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.value(), ex.getMessage());

       return new ResponseEntity<>(errorResponse,HttpStatus.UNAUTHORIZED);
   }

    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<ErrorResponse>handlerInsufficientBalanceException(InsufficientBalanceException ex, WebRequest request)
    {
        ErrorResponse errorResponse=new ErrorResponse(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(com.mykare.exception.NullPointerException.class)
    public ResponseEntity<ErrorResponse>handelNullPointerException(NullPointerException ex, WebRequest request)
    {
       ErrorResponse errorResponse=new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());

        return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse>handelNumberFormatException(NumberFormatException ex, WebRequest request)
    {
      ErrorResponse errorResponse=new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());

        return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<ErrorResponse>handelIOException(IOException ex, WebRequest request)
    {
        ErrorResponse errorResponse=new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}