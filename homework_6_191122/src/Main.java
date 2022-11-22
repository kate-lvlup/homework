// v classe main: method main sozdat' object classa Box, zadat' storonu, vuchislit' ploshad', sozdat' object
// classa Circle zadat' radius, vuvesti na ekran ploshad', takje dlya treygol'nika. Sozdat' dva objecta classa rabotnik,
// vuvesti informaciju o rabotnikah, povusit' zp ot 10 do 20 procentov, vuvesti na ekran i poschitat' novyju godovju ZP.

public class Main {
    public static void main(String[] args) {
        System.out.println("************* Task1 'Box' *************");
        Box box1 = new Box();
        box1.setHeight(10);
        System.out.println("Height equal: " + box1.getHeight());
        box1.setLength(8);
        System.out.println("Length equal: " + box1.getLength());
        box1.setWidth(5.5);
        System.out.println("Width equal: " + box1.getWidth());
        System.out.println("Volume equal: " + box1.calcVolume());
        System.out.println();
        System.out.println("************* Task2 'Circle' *************");
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        System.out.println("Radius equal: " + circle1.getRadius());
        System.out.println("Area of Circle equal: " + circle1.getAreaCircle());
        System.out.println();
        System.out.println("************* Task3 'Triangle' *************");
        Triangle triangle1 = new Triangle();
        triangle1.setSideA(17);
        System.out.println("Side A: " + triangle1.getSideA());
        triangle1.setSideB(19);
        System.out.println("Side B: " + triangle1.getSideB());
        triangle1.setSideC(10.5);
        System.out.println("Side C: " + triangle1.getSideC());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Area of Triangle: " + triangle1.getAreaTriangle());
        System.out.println();
        System.out.println("************* Task4 'Employee' *************");
        Employee employee1 = new Employee("0001", "Kate", "Yalanska", 11000);
        Employee employee2 = new Employee("0002", "Peter", "Parker", 5000);
        System.out.println("Employee1");
        System.out.println("ID employee1: " + employee1.getId());
        System.out.println("First Name employee1: " + employee1.getFirstName());
        System.out.println("Last Name employee1: " + employee1.getLastName());
        System.out.println("Salary employee1: " + employee1.getSalary());
        System.out.println("The salary for employee1 increased by: " + employee1.getIncreaseSalary(5));
        System.out.println("Annual salary for employee1: " + employee1.getAnnualSalary());
        System.out.println();
        System.out.println("Employee2");
        System.out.println("ID employee2: " + employee2.getId());
        System.out.println("First Name employee2: " + employee2.getFirstName());
        System.out.println("Last Name employee2: " + employee2.getLastName());
        System.out.println("Salary employee2: " + employee2.getSalary());
        System.out.println("The salary for employee2 increased by: " + employee2.getIncreaseSalary(15));
        System.out.println("Annual salary for employee2: " + employee2.getAnnualSalary());
    }
}