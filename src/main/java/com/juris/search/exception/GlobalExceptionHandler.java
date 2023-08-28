package com.juris.search.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = HandlerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody HandlerException
    handleException(HandlerException ex) {
        return new HandlerException(
                HttpStatus.NOT_FOUND.value(), ex);
    }
}
