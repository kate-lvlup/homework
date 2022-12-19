// Пример local class

public class LocalInnerClass {
    static int i = 5;
    int j = 6;

    void doIt(int e) {
        int r = 5;
        // Local classes определяются в методе. Имеют доступ к полям и методам внешнего класса LocalInnerClass,
        // а ткаже к переменным метода doIt(). Создать инстанс класса Local можно только в его методе.
        // Local class не может быть public, private, protected, а поля могут быть public, private, protected
        class Local {
            final static int q = 4;
            int w = j;
            int t = e;
            int y = r;

            static void doIt2() {
                System.out.println("Do it two times");
            }
        }
        Local local = new Local();
    }

    void doIt3() {
        class Local {
        }
    }

}



