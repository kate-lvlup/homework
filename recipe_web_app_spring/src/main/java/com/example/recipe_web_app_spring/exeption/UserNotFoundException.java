package com.example.recipe_web_app_spring.exeption;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String exeption) {
        super(exeption);
    }
}
