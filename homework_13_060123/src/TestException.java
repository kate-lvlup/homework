//Задачи:
//        Создать класс, в котором будут методы осуществляющие:
//        1. Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//        String s = null;
//        String m = s.toLowerCase();
//
//        2. Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//        int[] m = new int[2];
//        m[8] = 5;
//
//        3.Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
//        ArrayList<String> list = new ArrayList<String>();
//        String s = list.get(18);
//
//        4.Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//        int num=Integer.parseInt("XYZ");
//        System.out.println(num);

//        6. Создай метод public static void divideByZero, в котором подели любое число на ноль
//        и выведи на экран результат деления.
//        Оберни вызов метода divideByZero в try..catch.
//        Выведи стек-трейс исключения используя метод exception.printStackTrace()

import java.util.ArrayList;

public class TestException extends Exception {
    public static void exceptionHandling1() {
        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void exceptionHandling2() {
        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void exceptionHandling3() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void exceptionHandling4() {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int res = 5 / 0;
        System.out.println(res);
    }


}
