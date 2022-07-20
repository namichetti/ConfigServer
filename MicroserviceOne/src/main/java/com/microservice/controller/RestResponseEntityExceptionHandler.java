package com.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.logging.Level;
import java.util.logging.Logger;

@ControllerAdvice
public class RestResponseEntityExceptionHandler{

    private static final Logger LOGGER = Logger.getLogger(RestResponseEntityExceptionHandler.class.getName());

    @ExceptionHandler(org.springframework.http.converter.HttpMessageNotReadableException.class)
    protected ResponseEntity<Object> handleHttpMessageNotReadableExceptiond(Exception ex, WebRequest request) {
        LOGGER.log(Level.SEVERE,ex.getMessage(), request);
        return ResponseEntity.badRequest().body("Error in JSON");
    }
}
