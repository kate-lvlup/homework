package app.util;

import app.User;
import app.dao.UserDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UserUtils {

    public final UserDao userDao = new UserDao();

    public User verifyUsername(BufferedReader bufferedReader) throws IOException {
        boolean check = true;
        String username;
        while (check) {
            System.out.println("Enter username");
            username = bufferedReader.readLine();
            if (username.equals("X")) {
                return null;
            }
            if (validateUsername(username)) {
                User user = userDao.findUserByUserName(username);
                if (user != null) {
                    return user;
                }
                System.out.println("You entered username that is not exists");
                System.out.println("If you want to exit press X");
            } else {
                System.out.println("You entered wrong username, it must contain only alpha-numeric values:");
            }
        }
        return null;
    }

    public void fillUserFields(BufferedReader bufferedReader, User user) throws IOException {
        setUserName(bufferedReader, user);
        setUserPassword(bufferedReader, user);
        setUserFirstName(bufferedReader, user);
        setUserLastName(bufferedReader, user);
        setUserBirthday(bufferedReader, user);
        setUserEmail(bufferedReader, user);
        setPhoneNumber(bufferedReader, user);
        setUserAvailable(bufferedReader, user);
    }

    public void fillUserFieldsForEditing(BufferedReader bufferedReader, User userAfter, User userBefore) throws IOException {
        userAfter.setId(userBefore.getId());
        userAfter.setUsername(userBefore.getUsername());
        userAfter.setPassword(userBefore.getPassword());
        setUserFirstName(bufferedReader, userAfter);
        setUserLastName(bufferedReader, userAfter);
        setUserBirthday(bufferedReader, userAfter);
        setUserEmail(bufferedReader, userAfter);
        setPhoneNumber(bufferedReader, userAfter);
    }

    private void setUserName(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter username in alpha-numeric format:");
        boolean check = true;
        while (check) {
            String username = bufferedReader.readLine();
            if (validateUsername(username)) {
                user.setUsername(username);
                check = false;
            } else {
                System.out.println("You entered wrong username, it must contain only alpha-numeric values:");
            }
        }
    }

    private void setUserPassword(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter password with special symbols: !, @, #, $, %, min length of password is 4:");
        boolean check = true;
        while (check) {
            String password = bufferedReader.readLine();
            if (validatePassword(password)) {
                user.setPassword(password);
                check = false;
            } else {
                System.out.println("You entered wrong password, enter correct one again: ");
            }
        }
    }

    private void setUserBirthday(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter birth date in format MM/dd/yyyy");
        boolean check = true;
        while (check) {
            String stringDate = bufferedReader.readLine();
            if (validateDate(stringDate)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                LocalDate date = LocalDate.parse(stringDate, formatter);
                user.setDate(date);
                check = false;
            } else {
                System.out.println("You entered wrong date, enter correct one again: ");
            }
        }
    }

    private void setUserEmail(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter email");
        boolean check = true;
        while (check) {
            String email = bufferedReader.readLine();
            if (validateEmail(email)) {
                user.setEmail(email);
                check = false;
            } else {
                System.out.println("You entered wrong email, use format: username@domain.address ");
            }
        }
    }

    private void setUserAvailable(BufferedReader bufferedReader, User user) throws IOException {
        Random random = new Random();
        boolean isAvailable = random.nextBoolean();
        user.setAvailable(isAvailable);
    }

    private void setUserFirstName(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter First name");
        String firstName = bufferedReader.readLine();
        user.setFirstName(firstName);
    }

    private void setUserLastName(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter Last name");
        String lastName = bufferedReader.readLine();
        user.setLastName(lastName);
    }

    private void setPhoneNumber(BufferedReader bufferedReader, User user) throws IOException {
        System.out.println("Enter phone number");
        boolean check = true;
        while (check) {
            String phoneNumber = bufferedReader.readLine();
            if (validatePhoneNumber(phoneNumber)) {
                user.setPhoneNumber(phoneNumber);
                check = false;
            } else {
                System.out.println("You entered wrong phone number ");
            }
        }
    }

    public boolean validateUsername(String password) {
        return password.matches("[a-zA-Z0-9]{4,}");
    }

    public boolean validatePassword(String password) {
        return password.matches("^(?=.*[!@#$%])(?=\\S+$).{4,}$");
    }

    public boolean validateDate(String date) {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        df.setLenient(false);
        try {
            df.parse(date);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    public boolean validateEmail(String email) {
        return email.matches("\\w+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
    }

    public boolean validatePhoneNumber(String number) {
        return number.matches("^[+][0-9]{12}");
    }
}
