// 2. Создать собственную реализацию класса Math со статическими методами сложения,
// вычитания, умножения, деления, возвращения большего числа,
// меньшего числа(на вход два параметра), находнения большего целого числа,
// меньшего целого числа - округление(на вход число с плавающей точкой),
// возведение в степень, нахождение процента, квадратный корень

package myMathMethods;

public class MyMath {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    //    возвращения большего числа, меньшего числа(на вход два параметра)
    public static int maxValue(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minValue(int a, int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }

    //    находнения большего целого числа, меньшего целого числа - округление(на вход число с плавающей точкой)
    public static double maxValue(double x, double y) {
        if (x >= y) {
            return Math.round(x);
        } else {
            return Math.round(y);
        }
    }

    public static double minValue(double x, double y) {
        if (x <= y) {
            return Math.round(x);
        } else {
            return Math.round(y);
        }
    }

    //    возведение в степень
    public static int powValue(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }

    //    нахождение процента
    public static double percentValue(double x, double y) {
        return x * y / 100;
    }

    //    квадратный корень
    public static int sqrtValue(int a) {
        int b = a / 2;
        int c;
        do {
            c = b;
            b = (c + (a / c)) / 2;
        } while ((c - b) != 0);
        return b;
    }
}