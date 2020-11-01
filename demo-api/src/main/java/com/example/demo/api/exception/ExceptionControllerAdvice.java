package com.example.demo.api.exception;

import com.example.demo.api.util.UriUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handleUserNotFoundException(UserNotFoundException exception) {
        var httpStatus = HttpStatus.NOT_FOUND;
        return new ExceptionResponse(httpStatus.value(), httpStatus.getReasonPhrase(), UriUtil.path(), exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse handleUserNotFoundException(Exception exception) {
        var httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ExceptionResponse(httpStatus.value(), httpStatus.getReasonPhrase(), UriUtil.path(), exception.getMessage());
    }
}
