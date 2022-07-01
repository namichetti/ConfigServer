package com.relaciones.exception;

public class CustomException extends Exception{

    private final String message;

    public CustomException(String message){
        this.message = message;
    }
}
