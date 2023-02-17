import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private String firstName;
    private String lastName;
    private String country;
    private Date birthday;
    private double balance;
    private char gender;

    public Account(String firstName, String lastName, String country, double balance, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.balance = balance;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthdayString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = simpleDateFormat.parse(birthdayString);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", balance=" + balance +
                ", gender=" + gender +
                '}';
    }
}
