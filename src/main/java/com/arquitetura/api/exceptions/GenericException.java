package com.arquitetura.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class GenericException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public GenericException(String msg) {
        super(msg);
    }

}