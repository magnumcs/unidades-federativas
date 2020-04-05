package com.portifolio.unidadesfederativasapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class InternaServerErrorException extends Exception {

    public InternaServerErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
