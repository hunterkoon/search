package com.juris.search.exception;

import com.juris.search.model.ErrorDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = HandlerException.class)
    public ResponseEntity<ErrorDTO> handleException(HandlerException ex) {
        return new ResponseEntity<>(new ErrorDTO(HttpStatus.BAD_REQUEST, ex.getMessage(), ex.getDetails()), HttpStatus.BAD_REQUEST);
    }
}
