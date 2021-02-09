package com.starapp.ws.mobileappws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = -3786868992120708314L;

    public UserServiceException(String message) {
        super(message);
    }
}
