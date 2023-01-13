import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        TestException.exceptionHandling1();
        System.out.println();
        System.out.println("Task2");
        TestException.exceptionHandling2();
        System.out.println();
        System.out.println("Task3");
        TestException.exceptionHandling3();
        System.out.println();
        System.out.println("Task4");
        TestException.exceptionHandling4();
        System.out.println();
        System.out.println("Task5");
        try {
            method1();
        } catch (Exception1 e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        System.out.println();
        System.out.println("Task6");
        TestException.divideByZero();
        System.out.println();
        System.out.println("Task7");
        Data.readData();
        System.out.println();
        Data.testMethod1();

    }

//    Task5.Есть три исключения последовательно унаследованные от Exception:
//    class Exception1 extends Exception
//    class Exception2 extends Exception1
//    class Exception3 extends Exception2
//    Есть метод, который описан так:
//    public static void method1() throws Exception1, Exception2, Exception3
//    Напиши catch, который перехватит все три Exception1, Exception2 и Exception3

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (1 + Math.random() * 3);
        if (i == 1)
            throw new Exception1("i == 1");
        if (i == 2)
            throw new Exception2("i == 2");
        if (i == 3)
            throw new Exception3("i == 3");
    }

}




