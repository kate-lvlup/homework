package app.service;

import app.User;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class UserService {
    public void saveUser(User user, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(user.getId() + ",");
            bufferedWriter.write(user.getUsername() + ",");
            bufferedWriter.write(user.getPassword() + ",");
            bufferedWriter.write(user.getLastName() + ",");
            bufferedWriter.write(user.getFirstName() + ",");
            bufferedWriter.write(user.getDate() + ",");
            bufferedWriter.write(user.getEmail() + ",");
            bufferedWriter.write(user.getPhoneNumber() + ",");
            bufferedWriter.write(user.isAvailable() + "\n");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public List<User> loadUsers(File file) {
        List<User> users = new ArrayList<>();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        String[] usersToString = line.split(",");
                        User user = new User();
                        user.setId(Integer.parseInt(usersToString[0]));
                        user.setUsername(usersToString[1]);
                        user.setPassword(usersToString[2]);
                        user.setLastName(usersToString[3]);
                        user.setFirstName(usersToString[4]);
                        user.setDate(LocalDate.parse(usersToString[5]));
                        user.setEmail(usersToString[6]);
                        user.setPhoneNumber(usersToString[7]);
                        user.setAvailable(Boolean.parseBoolean(usersToString[8]));
                        users.add(user);
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return users;
    }

    //    Method1: Get a list of all the usernames in the list of Users.
    public static List<String> getListOfUsernames(List<User> users) {
        return users.stream()
                .map(user -> user.getUsername())
                .collect(toList());
    }

    //    Method2: Filter the list of User objects to only include users whose last name starts with "S".
    public static List<User> getListOfUserWithLastNameStartWithS(List<User> users) {
        return users.stream()
                .filter(user -> user.getLastName().charAt(0) == 'S')
                .collect(toList());
    }

    //    Method3: Get a list of all the User objects in the list that have an email address ending in ".com"
    public static List<User> getListOfUserEmailEndingCom(List<User> users) {
        return users.stream()
                .filter(user -> user.getEmail().endsWith(".com"))
                .collect(toList());
    }

    //    Method4: Get a list of all the User objects in the list that are available
    public static List<User> getListOfUserIsAvailable(List<User> users) {
        return users.stream()
                .filter(user -> user.isAvailable())
                .collect(toList());
    }

    //    Method5: Filter the list of User objects to only include users whose phoneNumber value is not null or empty,
    //    and convert the resulting list to a set.
    public static Set<User> getSetOfUserWithPhoneNumber(List<User> users) {
        return users.stream()
                .filter(user -> user.getPhoneNumber() != null)
                .filter(user -> !user.getPhoneNumber().equals(""))
                .collect(Collectors.toSet());
    }

    //    Method6: Group the User objects in the list by their firstName field (ignoring case),
    //    and then print sorting each group by their lastName field (ignoring case).
    public static void printGroupedUsers(List<User> users) {
        Map<String, List<User>> groupUsersMap = users.stream()
                .collect(Collectors.groupingBy(user -> user.getFirstName()));

        for (Map.Entry<String, List<User>> element : groupUsersMap.entrySet()) {
            List<User> userList = element.getValue().stream()
                    .sorted((User user1, User user2) -> user1.getLastName().compareToIgnoreCase(user2.getLastName()))
                    .toList();
            System.out.println(element.getKey() + userList);
        }
    }

    //    Method7:  Find the User objects in the list that have a firstName field that matches a given regular expression
    //    pattern, and return them sorted by their lastName field (ignoring case).
    public static List<User> getSortUserGroupedByPattern(List<User> users, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        return users.stream()
                .filter(user -> user.getFirstName().matches(String.valueOf(pattern)))
                .sorted((User user1, User user2) -> user1.getLastName().compareToIgnoreCase(user2.getLastName()))
                .collect(Collectors.toList());
    }

    //    Method8:  Find the User object in the list with the earliest date field,
    //    and return a Map containing the id as key and birthdate as value of that object.
    public static Map<Integer, LocalDate> getEarliestDateUserInfo(List<User> users) {
        Map<Integer, LocalDate> earliestDateUserInfoMap = users.stream()
                .sorted(Comparator.comparing(user -> user.getDate()))
                .findFirst()
                .stream()
                .collect(Collectors.toMap(user -> user.getId(), user -> user.getDate()));
        return earliestDateUserInfoMap;
    }

    //    Method9:  Find the User objects in the list that have a date field in the same year as a given date,
    //    and then group them by the month of their date field,
    //    and return a Map where the key is the month and the value is a list of User objects with that month.
    public static Map<Month, List<User>> getGropedUserByMonthWithExactYear(List<User> users, LocalDate localDate) {
        Map<Month, List<User>> gropedUserByMonthWithExactYearMap = users.stream()
                .filter(user -> user.getDate().getYear() == localDate.getYear())
                .collect(Collectors.groupingBy(user -> user.getDate().getMonth()));
        return gropedUserByMonthWithExactYearMap;
    }
}
