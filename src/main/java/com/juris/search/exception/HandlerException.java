package com.juris.search.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class HandlerException extends DataIntegrityViolationException {
    public HandlerException(String msg) {
        super(msg);
    }

    public HandlerException(int code, Throwable cause) {
        super(String.valueOf(code), cause);
    }
}
