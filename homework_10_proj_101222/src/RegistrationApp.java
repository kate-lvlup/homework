import java.util.Date;
import java.util.Scanner;

//TODO UserService
public class RegistrationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[10];
        int userId = 1;
        boolean exit = true;
        while (exit) {
            System.out.println("Hello, you can register user here." +
                    "To create user press 1, to list all available users press 2, to exit press 3");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    User user = new User();
                    user.setId(userId);
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
                    System.out.println("Enter password with special symbols: !, @, #, $, %, min length of password is 4:");
                    check = true;
                    while (check) {
                        String password = scanner.next();
                        if (validatePassword(password)) {
                            user.setPassword(password);
                            check = false;
                        } else {
                            System.out.println("You entered wrong password, enter correct one again: ");
                        }
                    }

//                    System.out.println("Enter First name");
//                    String firstName = scanner.next();
//                    System.out.println("Enter birthdate in format mm/dd/yyyy");
//                    String stringDate = scanner.next();
//                    System.out.println("Enter Last name");
//                    String lastName = scanner.next();
//                    Date date = new Date(stringDate);
//                    System.out.println("Enter email");
//                    String email = scanner.next();
//                    System.out.println("Enter phone number");
//                    String phoneNumber = scanner.next();
//                    System.out.println("Enter address");
//                    String address = scanner.next();

//                    user.setFirstName(firstName);
//                    user.setLastName(lastName);
//                    user.setDate(date);
//                    user.setEmail(email);
//                    user.setPhoneNumber(phoneNumber);
//                    user.setAddress(address);


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

    public static boolean validateUsername(String password) {
        String pattern = "[a-zA-Z0-9]{4,}";
        return password.matches(pattern);
    }

    //TODO RegEx
    public static boolean validatePassword(String password) {
        char[] symbolsArray = new char[]{'!', '@', '#', '$', '%'};
        char[] passwordChars = password.toCharArray();
        if (password.length() < 4) {
            return false;
        } else {
            for (int i = 0; i < passwordChars.length; i++) {
                for (int j = 0; j < symbolsArray.length; j++) {
                    if (passwordChars[i] == symbolsArray[j]) {
                        System.out.println(passwordChars[i]);
                        return true;

                    }
                }
            }
        }
        return false;
    }
}