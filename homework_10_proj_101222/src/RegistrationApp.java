import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class RegistrationApp {
    public void runApp() {
        File file = new File("users.txt");
        List<User> users = loadUsers(file);
        boolean exit = true;
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
                    "to exit press 0");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int input = Integer.parseInt(bufferedReader.readLine());
                switch (input) {
                    case 1 -> {
                        User user = new User();
                        user.setId(users.size());
                        fillUserFields(bufferedReader, user);
                        users.add(user);
                        saveUser(user, file);
                        System.out.println("User is created!");
                        System.out.println(user);
                    }
                    case 2 -> {
                        System.out.println("List of available users: ");
                        users.forEach(System.out::println);
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("Get a list of all the usernames in the list of Users: ");
                        System.out.println(RegistrationApp.getListOfUsernames(users));
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("Filter the list of User objects to only include users whose last name starts with 'S': ");
                        for (User user : RegistrationApp.getListOfUserWithLastNameStartWithS(users)) {
                            System.out.println(user);
                        }
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("Get a list of all the User objects in the list that have an email address ending in '.com': ");
                        for (User user : RegistrationApp.getListOfUserEmailEndingCom(users)) {
                            System.out.println(user);
                        }
                        System.out.println();
                    }
                    case 6 -> {
                        System.out.println("Get a set of all the User objects to only include users whose phoneNumber value is not null or empty: ");
                        for (User user : RegistrationApp.getSetOfUserWithPhoneNumber(users)) {
                            System.out.println(user);
                        }
                        System.out.println();
                    }
                    case 7 -> {
                        System.out.println("Get a list of all the User objects in the list that are available: ");
                        for (User user : RegistrationApp.getListOfUserIsAvailable(users)) {
                            System.out.println(user);
                        }
                        System.out.println();
                    }
                    case 8 -> {
                        System.out.println("Group the User objects in the list by their firstName field (ignoring case), and then print  sorting each group by their lastName field (ignoring case): ");
                        RegistrationApp.printGroupedUsers(users);
                        System.out.println();
                    }
                    case 9 -> {
                        System.out.println("Find the User objects in the list that have a firstName field that matches a given regular expression pattern, and return them sorted by their lastName field (ignoring case): ");
                        System.out.println(RegistrationApp.getSortUserGroupedByPattern(users, "Jay"));
                        System.out.println();
                    }
                    case 10 -> {
                        System.out.println("Find the User object in the list with the earliest date field, and return a Map containing the id as key and birthdate as value of that object: ");
                        Map<Integer, LocalDate> newMap = RegistrationApp.getEarliestDateUserInfo(users);
                        for (Map.Entry element : newMap.entrySet()) {
                            System.out.println("Id: " + element.getKey() + ", " + "Date: " + element.getValue());
                        }
                        System.out.println();
                    }
                    case 11 -> {
                        System.out.println("Find the User objects in the list that have a date field in the same year as a given date, and then group them by the month of their date field, and return a Map where the key is the month and the value is a list of User objects with that month: ");
                        LocalDate localDate = LocalDate.of(1999, 1, 7);
                        Map<Month, List<User>> newMap = RegistrationApp.getGropedUserByMonthWithExactYear(users, localDate);

                        for (Map.Entry element : newMap.entrySet()) {
                            System.out.println("Month: " + element.getKey() + ", " + "Users: " + element.getValue());
                        }
                        System.out.println();
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
    }

    private List<User> loadUsers(File file) {
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

    private void saveUser(User user, File file) {
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

    public static boolean validateUsername(String password) {
        return password.matches("[a-zA-Z0-9]{4,}");
    }

    public static boolean validatePassword(String password) {
        return password.matches("^(?=.*[!@#$%])(?=\\S+$).{4,}$");
    }

    public static boolean validateDate(String text) {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        df.setLenient(false);
        try {
            df.parse(text);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        return email.matches("\\w+@[a-zA-Z]+\\.[a-zA-Z]+");
    }

    public boolean validatePhoneNumber(String number) {
        return number.matches("^[+][0-9]{12}");
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

