package com.example.webexmaple1.util;

import com.example.webexmaple1.dao.imp.UserDaoImpl;
import com.example.webexmaple1.model.command.UserUpdateCommand;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class UserCommandValidator {

    private final UserDaoImpl userDao;

    public UserCommandValidator() {
        this.userDao = new UserDaoImpl();
    }

    public static Map<String, String> validateUserCommand(UserUpdateCommand updateCommand) {

        Map<String, String> errors = new HashMap<>();

        String username = updateCommand.getUsername();
        String firstName = updateCommand.getFirstName();
        String lastName = updateCommand.getLastName();
        String date = String.valueOf(updateCommand.getDate());
        String email = updateCommand.getEmail();
        String number = updateCommand.getPhoneNumber();
        String address = updateCommand.getAddress();

        if (!validateUsername(username)) {
            errors.put("username", "Username is invalid, please enter at least 4 letters or numbers");
        }
        if (!validateFirstName(firstName)) {
            errors.put("firstName", "First name must not be empty and contain only letters");
        }
        if (!validateLastName(lastName)) {
            errors.put("lastName", "Last name must not be empty and contain only letters");
        }
//        if(!validateDate(date)){
//            errors.put("date", "You entered a future date");
//        }
        if (!validateEmail(email)) {
            errors.put("email", "Please enter a valid email address");
        }
        if (!validatePhoneNumber(number)) {
            errors.put("number", "Enter correct phone number starting with a plus sign (+) followed by exactly 12 digits");
        }
        if (!validateAddress(address)) {
            errors.put("address", "Address shouldn't be empty");
        }
        return errors;
    }


    private static boolean validateUsername(String username) {

        return username.matches("[a-zA-Z0-9]{4,}");
    }

    private static boolean validateFirstName(String firstName) {
        return firstName.matches("[a-zA-Z]+");
    }

    private static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-Z]+");
    }

    private static boolean validateDate(String date) {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        df.setLenient(false);
        try {
            df.parse(date);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    private static boolean validateEmail(String email) {
        return email.matches("\\w+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
    }

    private static boolean validatePhoneNumber(String number) {
        return number.matches("^[+][0-9]{12}");
    }

    private static boolean validateAddress(String address) {
        return address.matches("[a-zA-Z0-9]{1,}");
    }
}
