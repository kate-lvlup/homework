// Создать пример реализации inner class. Пример static nested class.

public class OuterClass {
    int a = 1;
    private int b = 2;
    static int e = 5;
    private static int f = 6;

    static class StaticClass {

        //        void methodInStaticClass1(){System.out.println(a);} // Статический класс не видит переменных Внешнего класса, кроме статических

        static void methodInStaticClass2() {
            System.out.println("static int e = " + e);
        }

        static void methodInStaticClass3() {
            System.out.println("private static int f = " + f);
        }

    }

    InnerClass inner4 = new InnerClass();

    public void method1() {
        InnerClass inner1 = new InnerClass();
        inner1.method2();
        System.out.println("int c = " + inner1.c); // отображение переменной класса InnerClass с помощью инстанса класса InnerClass
        System.out.println("private int d = " + inner1.d); // отображение private переменной класса InnerClass с помощью инстанса класса InnerClass
        inner4.method2();
    }

    // Создаем Inner класс с переменными и методом
    public class InnerClass {
        int c = 3;
        private int d = 4;

        void method2() {
            System.out.println("int a = " + a); // отображение переменной класса OuterClass
            System.out.println("private int b = " + b); // отображение private переменной класса OuterClass
        }
    }
}
