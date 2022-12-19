import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TODO UserService
public class RegistrationApp {
    public void runApp() {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[10];
        int userId = 1;
        boolean exit = true;
        while (exit) {
            System.out.println("Hello, you can register user here." +
                    "To create user press 1, to list all available users press 2, to exit press 3");
            //TODO validation
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    User user = new User();
                    user.setId(userId);
                    setUserName(scanner, user);
                    setUserPassword(scanner, user);
                    setUserFirstLastName(scanner, user);
                    setUserBirthday(scanner, user);
                    setUserEmail(scanner, user);
                    setPhoneNumber(scanner, user);
                    users[userId - 1] = user;
                    userId++;
                    System.out.println("User is created!");
                    System.out.println(user);
                    break;
                case 2:
                    for (int i = 0; i < userId - 1; i++) {
                        System.out.println(users[i].toString());
                    }
                    System.out.println();
                    break;
                case 3:
                    exit = false;
                    System.out.println("Thank you for using our application");
                    break;
                default:
                    System.out.println("Wrong action, choose correct one(1, 2, 3)");
                    System.out.println();
                    break;
            }
        }
    }

    private void setUserName(Scanner scanner, User user) {
        System.out.println("Enter username in alpha-numeric format:");
        boolean check = true;
        while (check) {
            String username = scanner.next();
            if (validateUsername(username)) {
                user.setUsername(username);
                check = false;
            } else {
                System.out.println("You entered wrong username, it must contain only alpha-numeric values:");
            }
        }
    }

    private void setUserPassword(Scanner scanner, User user) {
        System.out.println("Enter password with special symbols: !, @, #, $, %, min length of password is 4:");
        boolean check = true;
        while (check) {
            String password = scanner.next();
            if (validatePassword(password)) {
                user.setPassword(password);
                check = false;
            } else {
                System.out.println("You entered wrong password, enter correct one again: ");
            }
        }
    }

    private void setUserBirthday(Scanner scanner, User user) {
        System.out.println("Enter birth date in format MM/dd/dd");
        boolean check = true;
        while (check) {
            String stringDate = scanner.next();
            if (validateDate(stringDate)) {
                Date date = new Date(stringDate);
                user.setDate(date);
                check = false;
            } else {
                System.out.println("You entered wrong date, enter correct one again: ");
            }
        }
    }

    private void setUserEmail(Scanner scanner, User user) {
        System.out.println("Enter email");
        boolean check = true;
        while (check) {
            String email = scanner.next();
            if (validateEmail(email)) {
                user.setEmail(email);
                check = false;
            } else {
                System.out.println("You entered wrong email, use format: username@domain.address ");
            }
        }
    }

    private void setUserFirstLastName(Scanner scanner, User user) {
        System.out.println("Enter First name");
        String firstName = scanner.next();
        user.setFirstName(firstName);
        System.out.println("Enter Last name");
        String lastName = scanner.next();
        user.setLastName(lastName);
    }

    private void setPhoneNumber(Scanner scanner, User user) {
        System.out.println("Enter phone number");
        boolean check = true;
        while (check) {
            String phoneNumber = scanner.next();
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

    public  static  boolean validatePassword(String password){
        return password.matches("^(?=.*[!@#$%])(?=\\S+$).{4,}$");
    }


//    //TODO RegEx
//    public static boolean validatePassword(String password) {
//        char[] symbolsArray = new char[]{'!', '@', '#', '$', '%'};
//        char[] passwordChars = password.toCharArray();
//        if (password.length() < 4) {
//            return false;
//        } else {
//            for (int i = 0; i < passwordChars.length; i++) {
//                for (int j = 0; j < symbolsArray.length; j++) {
//                    if (passwordChars[i] == symbolsArray[j]) {
//                        System.out.println(passwordChars[i]);
//                        return true;
//
//                    }
//                }
//            }
//        }
//        return false;
//    }

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
}

