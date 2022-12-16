// Создать пример реализации inner class. Пример static nested class. Пример local class

public class Electrocar {
    private int id;
    private static int test;

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;
        // 3-й тип вложенных классов: Класс в методе (Local).
        // Он имеет доступ к нестатическим полям Внешнего класса и к константным (final) переменным метода start() (final int x = 1)
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass SomeObject = new SomeClass();
        System.out.println("Electrocar " + id + " is starting...");
    }

    // вложенный нестатический класс (Inner), эти классы относятся к объекту т.е они имеют доступ к полям объекта
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // статический вложенный класс (Static)
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging..." + test);
        }
    }
}

