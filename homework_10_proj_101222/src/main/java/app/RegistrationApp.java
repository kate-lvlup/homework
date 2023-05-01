package app;

import app.service.UserService;
import app.util.UserUtils;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class RegistrationApp {
    public void runApp() {
        File file = new File("users.txt");
        UserService userService = new UserService();
        UserUtils userUtils = new UserUtils();
        List<User> users = userService.loadUsers(file);
        boolean exit = true;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (exit) {
                System.out.println("Hello, you can register user here." + "\n" +
                        "To create user press 1," + "\n" +
                        "to list all available users press 2," + "\n" +
                        "to get a list of all the usernames in the list of Users press 3," + "\n" +
                        "to filter the list of User objects to only include users whose last name starts with 'S' press 4," + "\n" +
                        "to get a list of all the User objects in the list that have an email address ending in '.com' press 5," + "\n" +
                        "to get a set of all the User objects to only include users whose phoneNumber value is not null or empty press 6," + "\n" +
                        "to get a list of all the User objects in the list that are available press 7," + "\n" +
                        "to group the User objects in the list by their firstName field (ignoring case), and then print  sorting each group by their lastName field (ignoring case) press 8," + "\n" +
                        "to get the User objects in the list that have a firstName field that matches a given regular expression pattern, and return them sorted by their lastName field (ignoring case) press 9," + "\n" +
                        "to get the User object in the list with the earliest date field, and return a Map containing the id as key and birthdate as value of that object press 10," + "\n" +
                        "to get the User objects in the list that have a date field in the same year as a given date, and then group them by the month of their date field, and return a Map where the key is the month and the value is a list of User objects with that month press 11," + "\n" +
                        "to edit user by it's id press 12," + "\n" +
                        "to exit press 0");
                try {
                    int input = Integer.parseInt(bufferedReader.readLine());
                    switch (input) {
                        case 1 -> {
                            User user = new User();
                            user.setId((long) users.size());
                            userUtils.fillUserFields(bufferedReader, user);
                            boolean result = userService.saveUser(user);
                            if (result) {
                                userService.saveUser(user, file);
                                users.add(user);
                                System.out.println("User is created!");
                                System.out.println(user);
                            } else {
                                System.out.println("Wrong!!!");
                            }
                        }
                        case 2 -> {
                            System.out.println("List of available users: ");
                            users.forEach(System.out::println);
                            System.out.println();
                        }
                        case 3 -> {
                            System.out.println("Get a list of all the usernames in the list of Users: ");
                            System.out.println(userService.getListOfUsernames(users));
                            System.out.println();
                        }
                        case 4 -> {
                            System.out.println("Filter the list of User objects to only include users whose last name starts with 'S': ");
                            for (User user : userService.getListOfUserWithLastNameStartWithChar(users, 'S')) {
                                System.out.println(user);
                            }
                            System.out.println();
                        }
                        case 5 -> {
                            System.out.println("Get a list of all the User objects in the list that have an email address ending in '.com': ");
                            for (User user : userService.filterByMailEndingWithString(users, ".com")) {
                                System.out.println(user);
                            }
                            System.out.println();
                        }
                        case 6 -> {
                            System.out.println("Get a set of all the User objects to only include users whose phoneNumber value is not null or empty: ");
                            for (User user : userService.getSetOfUserWithPhoneNumber(users)) {
                                System.out.println(user);
                            }
                            System.out.println();
                        }
                        case 7 -> {
                            System.out.println("Get a list of all the User objects in the list that are available: ");
                            for (User user : userService.getListOfUserIsAvailable(users)) {
                                System.out.println(user);
                            }
                            System.out.println();
                        }
                        case 8 -> {
                            System.out.println("Group the User objects in the list by their firstName field (ignoring case), and then print  sorting each group by their lastName field (ignoring case): ");
                            userService.printGroupedUsers(users);
                            System.out.println();
                        }
                        case 9 -> {
                            System.out.println("Find the User objects in the list that have a firstName field that matches a given regular expression pattern, and return them sorted by their lastName field (ignoring case): ");
                            System.out.println(userService.getSortUserGroupedByPattern(users, "Jay"));
                            System.out.println();
                        }
                        case 10 -> {
                            System.out.println("Find the User object in the list with the earliest date field, and return a Map containing the id as key and birthdate as value of that object: ");
                            Map<Long, LocalDate> newMap = userService.getEarliestDateUserInfo(users);
                            for (Map.Entry element : newMap.entrySet()) {
                                System.out.println("Id: " + element.getKey() + ", " + "Date: " + element.getValue());
                            }
                            System.out.println();
                        }
                        case 11 -> {
                            System.out.println("Find the User objects in the list that have a date field in the same year as a given date, and then group them by the month of their date field, and return a Map where the key is the month and the value is a list of User objects with that month: ");
                            LocalDate localDate = LocalDate.of(1999, 1, 7);
                            Map<Month, List<User>> newMap = userService.getGropedUserByMonthWithExactYear(users, localDate);

                            for (Map.Entry element : newMap.entrySet()) {
                                System.out.println("Month: " + element.getKey() + ", " + "Users: " + element.getValue());
                            }
                            System.out.println();
                        }
                        case 12 -> {
                            User userForEdit = userUtils.verifyUsername(bufferedReader);
                            userUtils.updateUserFields(bufferedReader, userForEdit);
                            userService.editUser(userForEdit);
                        }
                        case 0 -> {
                            exit = false;
                            System.out.println("Thank you for using our application");
                        }
                        default -> System.out.println("Wrong action, choose correct one (from 1 - to 11)");
                    }
                } catch (NumberFormatException exception) {
                    System.out.println(exception.getStackTrace()[0].toString());
                    System.out.println("Wrong action, choose correct one(1,2,3)");
                    System.out.println("Let`s repeat your action!\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

