// Napisat' class Employee s paramenntrami ID, firstName, lastName i salary, konstryktor kotorum
// zadaetsya ID, imya, familiya i ZP, a takje methodu polycheniya imeni, familii, ID, i tekyshey ZP,
// method povusheniya ZP, kotoruu prinimaet parametr procenta na kotoruu nyjno podnyat' ZP, napisat'
// method kotoruu vuvodit na ekran godovyju ZP.

public class Employee {
    String id;
    String firstName;
    String lastName;
    double salary;
    double saldoSalary;

    Employee(String id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public double getRaiseSalary(double percent) {
        return this.saldoSalary = percent / 100 * salary;
    }

    public double getYearSalary() {
        return (salary + saldoSalary) * 12;
    }
}
