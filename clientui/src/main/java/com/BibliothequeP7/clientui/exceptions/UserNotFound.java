package com.BibliothequeP7.clientui.exceptions;

public class UserNotFound extends RuntimeException {

    public UserNotFound (String message) {
        super(message);
    }
}

