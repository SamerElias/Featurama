package com.crucial.featurama.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

     @ExceptionHandler(InvalidPasswordException.class)
     public ResponseEntity<ErrorResponse> handleInvalidPasswordException(InvalidPasswordException ex) {
         var error = ErrorResponse.builder()
                 .status(HttpStatus.BAD_REQUEST.value())
                 .message(ex.getMessage())
                 .timestamp(System.currentTimeMillis())
                 .build();
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
     }

}
