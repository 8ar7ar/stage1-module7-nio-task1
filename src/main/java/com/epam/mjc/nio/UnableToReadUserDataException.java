package com.epam.mjc.nio;

public class UnableToReadUserDataException extends RuntimeException {
    public UnableToReadUserDataException(String message, Throwable cause){
        super(message, cause);
    }
}
