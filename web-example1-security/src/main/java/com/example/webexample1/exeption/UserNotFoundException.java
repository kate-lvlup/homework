package com.example.webexample1.exeption;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String exeption) {
        super(exeption);
    }
}
