import java.time.LocalDate;

public class Account {
    private String firstName;
    private String lastName;
    private String country;
    private LocalDate birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(int year, int month, int day) {
        this.birthday = LocalDate.of(year, month, day);
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
